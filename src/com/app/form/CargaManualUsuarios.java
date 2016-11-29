/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.form;

import com.app.controller.CargoController;
import com.app.controller.CiudadDeptoController;
import com.app.controller.EstadoCivilController;
import com.app.controller.EstadoController;
import com.app.controller.TipoViviendaController;
import com.app.controller.UserController;
import com.app.models.SadCargo_TO;
import com.app.models.SadCiudadDepto_TO;
import com.app.models.SadEstadoCivil_TO;
import com.app.models.SadEstado_TO;
import com.app.models.SadRecursoHumano_TO;
import com.app.models.SadTipoVivienda_TO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GERFOR
 */
public final class CargaManualUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaManualUsuarios
     *
     * @throws java.sql.SQLException
     */
    public CargaManualUsuarios() throws SQLException {
        initComponents();

        init();

    }

    public void init() throws SQLException {

        try {
            List<SadCiudadDepto_TO> departamentos = new ArrayList<>();
            List<SadCiudadDepto_TO> ciudades = new ArrayList<>();
            List<SadEstado_TO> estados = new ArrayList<>();
            List<SadTipoVivienda_TO> tViviendas = new ArrayList<>();
            List<SadCargo_TO> cargos = new ArrayList<>();
            List<SadEstadoCivil_TO> estadoCivil = new ArrayList<>();

            CiudadDeptoController ciudadDeptoController = new CiudadDeptoController();
            EstadoController estadoController = new EstadoController();
            TipoViviendaController tipoViviendaController = new TipoViviendaController();
            CargoController cargoController = new CargoController();
            EstadoCivilController estadoCivilController = new EstadoCivilController();

            departamentos = ciudadDeptoController.consultarDepartamento();
            ciudades = ciudadDeptoController.consultarCiudad();
            estados = estadoController.consultarEstado();
            tViviendas = tipoViviendaController.consultarTipoVivienda();
            cargos = cargoController.consultarCargo();
            estadoCivil = estadoCivilController.consultarEstadoCivil();

            jComboBox1.addItem("Seleccione");
            jComboBox2.addItem("Seleccione");
            jComboBox3.addItem("Seleccione");
            jComboBox4.addItem("Seleccione");
            jComboBox6.addItem("Seleccione");
            jComboBox9.addItem("Seleccione");
//            jComboBox10.addItem("Seleccione");
//            jComboBox11.addItem("Seleccione");
//            jComboBox12.addItem("Seleccione");
//            jComboBox13.addItem("Seleccione");
            jComboBox14.addItem("Seleccione");
            jComboBox14.addItem("1");
            jComboBox14.addItem("2");
            jComboBox14.addItem("3");
            jComboBox14.addItem("4");
            jComboBox14.addItem("5");
            jComboBox14.addItem("6");
            jComboBox15.addItem("Seleccione");

            for (int i = 0; i < departamentos.size(); i++) {
                jComboBox1.addItem(departamentos.get(i).getCdsCodDepto() + " - " + departamentos.get(i).getCdsDepto());
            }

            for (int i = 0; i < ciudades.size(); i++) {
                jComboBox2.addItem(ciudades.get(i).getCdsCodCiudad() + " - " + ciudades.get(i).getCdsCiudad());
            }

            for (int i = 0; i < departamentos.size(); i++) {
                jComboBox3.addItem(departamentos.get(i).getCdsCodDepto() + " - " + departamentos.get(i).getCdsDepto());
            }

            for (int i = 0; i < ciudades.size(); i++) {
                jComboBox4.addItem(ciudades.get(i).getCdsCodCiudad() + " - " + ciudades.get(i).getCdsCiudad());
            }

            for (int i = 0; i < estadoCivil.size(); i++) {
                jComboBox6.addItem(estadoCivil.get(i).getSecCodigo() + " - " + estadoCivil.get(i).getSecDescripcion());
            }

            for (int i = 0; i < estados.size(); i++) {
                jComboBox9.addItem(estados.get(i).getEstCodigo() + " - " + estados.get(i).getEstDescripcion());
            }

//            for (int i = 0; i < cargos.size(); i++) {
//                jComboBox10.addItem(cargos.get(i).getCarCodigo() + " - " + cargos.get(i).getCarDescripcion());
//            }
//
//            for (int i = 0; i < cargos.size(); i++) {
//                jComboBox11.addItem(cargos.get(i).getCarCodigo() + " - " + cargos.get(i).getCarDescripcion());
//            }
//
//            for (int i = 0; i < departamentos.size(); i++) {
//                jComboBox12.addItem(departamentos.get(i).getCdsCodDepto() + " - " + departamentos.get(i).getCdsDepto());
//            }
//
//            for (int i = 0; i < ciudades.size(); i++) {
//                jComboBox13.addItem(ciudades.get(i).getCdsCodCiudad() + " - " + ciudades.get(i).getCdsCiudad());
//            }
            for (int i = 0; i < tViviendas.size(); i++) {
                jComboBox15.addItem(tViviendas.get(i).getStvCodigo() + " - " + tViviendas.get(i).getStvDescripion());
            }

        } catch (Exception ex) {
            Logger.getLogger(CargaManualUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupRh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        tf_nombres = new javax.swing.JTextField();
        tf_apellido1 = new javax.swing.JTextField();
        tf_apellido2 = new javax.swing.JTextField();
        tf_fechaNac = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jRadioButtonPositivo = new javax.swing.JRadioButton();
        jRadioButtonNegativo = new javax.swing.JRadioButton();
        jComboBox6 = new javax.swing.JComboBox();
        tf_direccion = new javax.swing.JTextField();
        tf_barrio = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_celular = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        tf_correo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox14 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Creación de Usuarios");

        jLabel31.setText("(Ultima fecha verificado: xxxx-xx-xx)");

        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAutoscrolls(true);

        jLabel2.setText("Cédula de Ciudadania: ");

        jLabel3.setText("Depto. Expedición: ");

        buttonGroupSexo.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciudad Expedición:");

        jLabel5.setText("Nombres: ");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Fecha de Nacimiento:");

        jLabel9.setText("Depto. Origen:");

        jLabel10.setText("Ciudad Origen:");

        jLabel11.setText("sexo:");

        jLabel12.setText("Grupo Sanguineo:");

        jLabel13.setText("Estado Civil:");

        jLabel14.setText("Dirección:");

        jLabel15.setText("Barrio:");

        jLabel16.setText("Teléfono:");

        jLabel17.setText("Celular:");

        jLabel18.setText("Tipo de Vivienda:");

        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel20.setText("RH");

        buttonGroupRh.add(jRadioButtonPositivo);
        jRadioButtonPositivo.setText("+");
        jRadioButtonPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPositivoActionPerformed(evt);
            }
        });

        buttonGroupRh.add(jRadioButtonNegativo);
        jRadioButtonNegativo.setText("-");

        jLabel21.setText("Edad:");

        jLabel8.setText("Estado:");

        jLabel26.setText("Correo Institucional:");

        jButton2.setText("Buscar");

        jLabel33.setText("Estrato:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_celular, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_barrio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(10, 10, 10)
                        .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_apellido2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButtonFemenino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonPositivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonNegativo))
                                    .addComponent(jRadioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel18))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.TRAILING, 0, 255, Short.MAX_VALUE)
                                    .addComponent(jComboBox14, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox15, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_fechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButtonFemenino)
                            .addComponent(jRadioButtonMasculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonPositivo)
                            .addComponent(jRadioButtonNegativo)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tf_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addContainerGap(579, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SadRecursoHumano_TO srrhh = new SadRecursoHumano_TO();

        int sexo = 0;
        String rh = "";

        UserController userController = null;
        try {
            userController = new UserController();
        } catch (SQLException ex) {
            Logger.getLogger(CargaManualUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!(tf_cedula.getText().equals(""))) {

            srrhh.setRhNumIden(Long.parseLong(tf_cedula.getText()));
            srrhh.setRhNombres(tf_nombres.getText());
            srrhh.setRhApellido1(tf_apellido1.getText());
            srrhh.setRhApellido2(tf_apellido2.getText());
            srrhh.setRhDireccion(tf_direccion.getText());
            srrhh.setRhBarrio(tf_barrio.getText());
            if (!(tf_celular.getText().equals(""))) {
                srrhh.setRhCelular(Long.parseLong(tf_celular.getText()));
            } else {
                srrhh.setRhCelular(0);
            }
            srrhh.setRhCorreo(tf_correo.getText());
//            srrhh.setRhNombreEmergencia(tf_nombreApellidoEmergencia.getText());
//            srrhh.setRhTelEmergencia(tf_telefonoEmergencia.getText());

            String depIden = (String) jComboBox1.getSelectedItem();
            String[] depIdenA = depIden.split(" - ");
            int codDep = Integer.parseInt(depIdenA[0]);
            srrhh.setRhCodDeptoIden(codDep);

            String ciuIden = (String) jComboBox2.getSelectedItem();
            String[] ciuIdenA = ciuIden.split(" - ");
            int codCiu = Integer.parseInt(ciuIdenA[0]);
            srrhh.setRhCodCiudadIden(codCiu);

            String depOri = (String) jComboBox3.getSelectedItem();
            String[] depOriA = depOri.split(" - ");
            int codDepOri = Integer.parseInt(depOriA[0]);
            srrhh.setRhCodDeptoOrigen(codDepOri);

            String ciuOri = (String) jComboBox4.getSelectedItem();
            String[] ciuOriA = ciuOri.split(" - ");
            int codCiuOri = Integer.parseInt(ciuOriA[0]);
            srrhh.setRhCodCiudadOrigen(codCiuOri);

            String estadoCivil = (String) jComboBox6.getSelectedItem();
            String[] estadoCivilA = estadoCivil.split(" - ");
            int codEstadoCivil = Integer.parseInt(estadoCivilA[0]);
            srrhh.setRhCodEstCivil(codEstadoCivil);

            String tipoVivienda = (String) jComboBox15.getSelectedItem();
            String[] tipoViviendaA = tipoVivienda.split(" - ");
            int codTipoViviendaA = Integer.parseInt(tipoViviendaA[0]);
            srrhh.setRhCodTipVivienda(codTipoViviendaA);

//            int codEstrato = 0;
//            if (!(jComboBox14.getSelectedItem().toString().equals("Seleccione"))) {
            int codEstrato = Integer.parseInt(jComboBox14.getSelectedItem().toString());
//            }
            srrhh.setRhEstrato(codEstrato);

            String estado = (String) jComboBox9.getSelectedItem();
            String[] estadoA = estado.split(" - ");
            int codEstadoA = Integer.parseInt(estadoA[0]);
            srrhh.setRhCodEstado(codEstadoA);

            if (jRadioButtonFemenino.isSelected() == true) {
                sexo = 2;
            } else if (jRadioButtonMasculino.isSelected() == true) {
                sexo = 1;
            }
            srrhh.setRhCodSexo(sexo);

            if (jRadioButtonPositivo.isSelected() == true) {
                rh = "+";
            } else if (jRadioButtonNegativo.isSelected() == true) {
                rh = "-";
            }
            srrhh.setRhRH(rh);
            
            srrhh.setRhGrupoSang(jComboBox5.getSelectedItem().toString().trim());

//            String cargo = (String) jComboBox10.getSelectedItem();
//            String[] cargoA = cargo.split(" - ");
//            int codCargoA = Integer.parseInt(cargoA[0]);
//            srrhh.setRhCodCargo(codCargoA);
//
//            String dependecia = (String) jComboBox11.getSelectedItem();
//            String[] dependeciaA = dependecia.split(" - ");
//            int codDependenciaA = Integer.parseInt(dependeciaA[0]);
//            srrhh.setrh(codDependenciaA);
            //      srrhh.set
            try {
                int valor = userController.registrarClientes(srrhh);
                if (valor > 0) {
                    JOptionPane.showMessageDialog(null, "Registro realizado satisfactoriamente");

                    tf_cedula.setText("");
                    tf_nombres.setText("");
                    tf_apellido1.setText("");
                    tf_apellido2.setText("");
                    tf_direccion.setText("");
                    tf_barrio.setText("");
                    tf_celular.setText("");
                    tf_correo.setText("");
//                    tf_nombreApellidoEmergencia.setText("");
//                    tf_telefonoEmergencia.setText("");
                    tf_telefono.setText("");
                    
                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jComboBox3.setSelectedIndex(0);
                    jComboBox4.setSelectedIndex(0);
                    jComboBox5.setSelectedIndex(0);
                    jComboBox6.setSelectedIndex(0);
                    jComboBox9.setSelectedIndex(0);
                    jComboBox14.setSelectedIndex(0);
                    jComboBox15.setSelectedIndex(0);                    
                            

                }
            } catch (Exception ex) {
                Logger.getLogger(CargaManualUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "El número de Identificación no puede estar vacio");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void jRadioButtonPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPositivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPositivoActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRh;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JRadioButton jRadioButtonNegativo;
    private javax.swing.JRadioButton jRadioButtonPositivo;
    private javax.swing.JTextField tf_apellido1;
    private javax.swing.JTextField tf_apellido2;
    private javax.swing.JTextField tf_barrio;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_celular;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_fechaNac;
    private javax.swing.JTextField tf_nombres;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
