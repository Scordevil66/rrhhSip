/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.utils;

import com.app.controller.UserController;
import com.app.form.CargaManualUsuario;
import com.app.models.SadRecursoHumano_TO;
import com.csvreader.CsvReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.biff.CountryCode;
import jxl.read.biff.BiffException;

/**
 *
 * @author Gustavo Cardenas
 */
public class LeerArchivoDeExcel {

    public static void main(String[] args) throws IOException, BiffException, FileNotFoundException, SQLException {
//
        String a = "D:\\RRHH/Ejemplo archivos carga masiva.csv";
//
        CargaDeFormularios(a);
    }

    //Funcional
    public static void ActualizarVacaciones(String path) throws IOException, BiffException {

        boolean equals1 = false, equals2 = false, equals3 = false, equals4 = false, equals5 = false;
        File file = new File(path);
        if (file.exists() == true) {

            WorkbookSettings wbSettings = new WorkbookSettings();
            wbSettings.setEncoding("ISO-8859-1");
            wbSettings.setLocale(new Locale("es", "ES"));
            wbSettings.setExcelDisplayLanguage("ES");
            wbSettings.setExcelRegionalSettings("ES");
            wbSettings.setCharacterSet(CountryCode.SPAIN.getValue());

            Workbook workbook = Workbook.getWorkbook(new File(path), wbSettings); //Pasamos el excel que vamos a leer
            Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer
            String accion = "", cedula = "", fechaInicial = "", fichaFinal = "", diasPendientes = "";

            for (int fil = 0; fil < 1; fil++) {
                equals1 = sheet.getCell(0, fil).getContents().equals("ACCION");
                equals2 = sheet.getCell(1, fil).getContents().equals("Cedula");
                equals3 = sheet.getCell(2, fil).getContents().equals("Fecha Inicial Periodo");
                equals4 = sheet.getCell(3, fil).getContents().equals("Fecha Final Periodo");
                equals5 = sheet.getCell(4, fil).getContents().equals("Días Vacaciones Pendientes");

            }

            if (equals1 == true && equals2 == true && equals3 == true && equals4 == true
                    && equals5 == true) {

                for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas

                    accion = sheet.getCell(0, fila).getContents(); //setear la celda leida a nombre
                    cedula = sheet.getCell(1, fila).getContents();
                    fechaInicial = sheet.getCell(2, fila).getContents();
                    fichaFinal = sheet.getCell(3, fila).getContents();
                    diasPendientes = sheet.getCell(4, fila).getContents();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Estructura Incorrecta");
                //Estructura incorrecta
            }
        } else {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            // archivo no encontrado
        }
    }

//    public static void CargaDeFormularios(String path, int idEmpresa) throws IOException, BiffException {
//
//        boolean equals1 = false, equals2 = false, equals3 = false, equals4 = false, equals5 = false, equals6 = false, equals7 = false, equals8 = false, equals9 = false, equals10 = false, equals11 = false, equals12 = false, equals13 = false, equals14 = false, equals15 = false, equals16 = false, equals17 = false, equals18 = false;
//        File file = new File(path);
//        if (file.exists() == true) {
//
//            WorkbookSettings wbSettings = new WorkbookSettings();
//            wbSettings.setEncoding("ISO-8859-1");
//            wbSettings.setLocale(new Locale("es", "ES"));
//            wbSettings.setExcelDisplayLanguage("ES");
//            wbSettings.setExcelRegionalSettings("ES");
//            wbSettings.setCharacterSet(CountryCode.SPAIN.getValue());
//
//            Workbook workbook = Workbook.getWorkbook(new File(path), wbSettings); //Pasamos el excel que vamos a leer
//            Sheet sheet = workbook.getSheet(0); //Seleccionamos la hoja que vamos a leer
//            String accion = "", cedula = "", fechaInicial = "", fichaFinal = "", diasPendientes = "";
//
//            for (int fil = 0; fil < 1; fil++) {
//                equals1 = sheet.getCell(0, fil).getContents().equals("ACCION");
//                equals2 = sheet.getCell(1, fil).getContents().equals("Cedula");
//                equals3 = sheet.getCell(2, fil).getContents().equals("Fecha Inicial Periodo");
//                equals4 = sheet.getCell(3, fil).getContents().equals("Fecha Final Periodo");
//                equals5 = sheet.getCell(4, fil).getContents().equals("Días Vacaciones Pendientes");
//
//            }
//
//            if (equals1 == true && equals2 == true && equals3 == true && equals4 == true
//                    && equals5 == true ) {
//
//                for (int fila = 1; fila < sheet.getRows(); fila++) { //recorremos las filas
//
//                    accion = sheet.getCell(0, fila).getContents(); //setear la celda leida a nombre
//                    cedula = sheet.getCell(1, fila).getContents();
//                    fechaInicial = sheet.getCell(2, fila).getContents();
//                    fichaFinal = sheet.getCell(3, fila).getContents();
//                    diasPendientes = sheet.getCell(4, fila).getContents();
//                    
//                }
//            } else {
//                //Estructura incorrecta
//            }
//        } else {
//           // archivo no encontrado
//        }
//    }
    public static int CargaDeFormularios(String path) throws FileNotFoundException, IOException, SQLException {
        
        int valor = 0;

        SadRecursoHumano_TO srrhh = new SadRecursoHumano_TO();

        UserController userController = new UserController();

        CsvReader usuarios_import = new CsvReader(path);
        usuarios_import.readHeaders();

        while (usuarios_import.readRecord()) {
            String text = usuarios_import.get(0);

            String[] array = text.split(";");

            String cedula = array[0].trim();
            String depExpCed = array[1].trim();
            String ciudadExp = array[2].trim();
            String nombres = array[3].trim();
            String apellido1 = array[4].trim();
            String apellido2 = array[5].trim();
            String fechaNacimiento = array[6].trim();
            String dptoOrigen = array[7].trim();
            String ciudadOrigen = array[8].trim();
            String sexo = array[9].trim();
            String estadoCivil = array[10].trim();
            String direccion = array[11].trim();
            String telefono = array[12].trim();
            String celular = array[13].trim();
            String tipoVivienda = array[14].trim();
            String estrato = array[15].trim();
            String correo = array[16].trim();

            if (!(cedula.equals(""))) {

                srrhh.setRhNumIden(Long.parseLong(cedula));
                srrhh.setRhNombres(nombres);
                srrhh.setRhApellido1(apellido1);
                srrhh.setRhApellido2(apellido2);
                srrhh.setRhDireccion(direccion);
                if (!(celular.equals(""))) {
                    srrhh.setRhCelular(Long.parseLong(celular));
                } else {
                    srrhh.setRhCelular(0);
                }
                srrhh.setRhCorreo(correo);

//      srrhh.set
                try {
                    int a = userController.registrarClientes(srrhh);

                } catch (Exception ex) {
                    Logger.getLogger(CargaManualUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            valor++;

        }

        usuarios_import.close();
        
        return valor;

    }

}
