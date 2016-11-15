/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadRecursoHumano_TO;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class UserController {

    Statement st = ConexionSQL.conexion();

    public int registrarClientes(SadRecursoHumano_TO usuario) throws Exception {

        int user = 0;

        try {

            String sql = "INSERT INTO `sadrecursohumano` (`rhNumIden`,"
                    + " `rhCodDeptoIden`, `rhCodCiudadIden`, `rhFchIngreso`,"
                    + " `rhNombres`, `rhApellido1`, `rhApellido2`, "
                    + "`rhCodSexo`, `rhCodEstCivil`, `rhDireccion`,"
                    + " `rhBarrio`, `rhFchNacimiento`, `rhCodDeptoOrigen`, "
                    + "`rhCodCiudadOrigen`, `rhTelefono`, `rhCelular`,"
                    + " `rhCodTipVivienda`, `rhEstrato`, `rhLibretaMilitar`, "
                    + "`rhDistrito`, `rhClase`, `rhGrupoSang`, `rhRH`, "
                    + "`rhCodCargo`, `rhCodDeptoCargo`, `rhCodCiudadCargo`,"
                    + " `rhNombreEmergencia`, `rhTelEmergencia`, `rhCodCcosto`, "
                    + "`rhMedsAlergico`, `rhImagen`, `rhCodEstado`, `rhCorreo`)"
                    + " VALUES ('20606989', NULL,"
                    + " NULL, NULL,"
                    + " 'Gustavo', 'Cardenas', "
                    + "'Garcia', NULL, "
                    + "NULL, 'calle 100',"
                    + " 'mazuren', NULL,"
                    + " NULL, NULL,"
                    + " '16666666', '3156666666',"
                    + " NULL, NULL,"
                    + " NULL, NULL,"
                    + " NULL, NULL,"
                    + " NULL, NULL,"
                    + " NULL, NULL,"
                    + " 'Albania Donis', '3157777777',"
                    + " NULL, NULL,"
                    + " NULL, '',"
                    + " 'cardenasg66@gmail.com');";

            System.out.println("sql: " + sql);

            st.execute(sql);

            user++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return user;

    }

}
