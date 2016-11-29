/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadEstadoCivil_TO;
import com.app.models.SadRecursoHumano_TO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jxl.write.DateTime;

/**
 *
 * @author Gustavo
 */
public class UserController {

    Statement st;

    public UserController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarClientes(SadRecursoHumano_TO usuario) throws Exception {

        int user = 0;

        String[] fechaN = usuario.getRhFchNacimientoString().split("/");
        String diaN = fechaN[0];
        String mesN = fechaN[1];
        String anioN = fechaN[2];

        try {

            String sql = "INSERT INTO [dbo].[sadRecursoHumano] "
                    + "           ([rhNumIden] "
                    + "           ,[rhCodDeptoIden]"
                    + "           ,[rhCodCiudadIden]"
                    + "           ,[rhNombres]"
                    + "           ,[rhApellido1]"
                    + "           ,[rhApellido2]"
                    + "           ,[rhCodSexo]"
                    + "           ,[rhCodEstCivil]"
                    + "           ,[rhDireccion]"
                    + "           ,[rhBarrio]"
                    + "           ,[rhFchNacimiento]"
                    + "           ,[rhCodDeptoOrigen]"
                    + "           ,[rhCodCiudadOrigen]"
                    + "           ,[rhTelefono]"
                    + "           ,[rhCelular]"
                    + "           ,[rhCodTipVivienda]"
                    + "           ,[rhEstrato]"
                    + "           ,[rhGrupoSang]"
                    + "           ,[rhRH]"
                    + "           ,[rhCodEstado]"
                    + "           ,[rhCorreo])"
                    + "     VALUES "
                    + "           (" + usuario.getRhNumIden()
                    + "           ," + usuario.getRhCodDeptoIden()
                    + "           ," + usuario.getRhCodCiudadIden()
                    + "           ,'" + usuario.getRhNombres()
                    + "'           ,'" + usuario.getRhApellido1()
                    + "'           ,'" + usuario.getRhApellido2()
                    + "'           ," + usuario.getRhCodSexo()
                    + "           ," + usuario.getRhCodEstCivil()
                    + "           ,'" + usuario.getRhDireccion()
                    + "'           ,'" + usuario.getRhBarrio()
                    + "'           ,CONVERT(VARCHAR, '" + mesN+"/"+diaN+"/" +anioN +"', 103)"
                    + "'           ," + usuario.getRhCodDeptoOrigen()
                    + "           ," + usuario.getRhCodCiudadOrigen()
                    + "           ," + usuario.getRhTelefono()
                    + "           ," + usuario.getRhCelular()
                    + "           ," + usuario.getRhCodTipVivienda()
                    + "           ," + usuario.getRhEstrato()
                    + "           ,'" + usuario.getRhGrupoSang()
                    + "'           ,'" + usuario.getRhRH()
                    + "'           ," + usuario.getRhCodEstado()
                    + "           ,'" + usuario.getRhCorreo() + "');";

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

    public SadRecursoHumano_TO consultarClientesPorCedula(SadRecursoHumano_TO usuario) throws Exception {

        SadRecursoHumano_TO Cliente = new SadRecursoHumano_TO();

        try {

            String sql = "SELECT [rhNumIden] "
                    + "      ,[rhCodDeptoIden] "
                    + "      ,[rhCodCiudadIden] "
                    + "      ,[rhNombres] "
                    + "      ,[rhApellido1] "
                    + "      ,[rhApellido2] "
                    + "      ,[rhCodSexo] "
                    + "      ,[rhCodEstCivil] "
                    + "      ,[rhDireccion] "
                    + "      ,[rhBarrio] "
                    + "      ,[rhFchNacimiento] "
                    + "      ,[rhCodDeptoOrigen] "
                    + "      ,[rhCodCiudadOrigen] "
                    + "      ,[rhTelefono] "
                    + "      ,[rhCelular] "
                    + "      ,[rhCodTipVivienda] "
                    + "      ,[rhEstrato] "
                    + "      ,[rhGrupoSang] "
                    + "      ,[rhRH] "
                    + "      ,[rhCodEstado] "
                    + "      ,[rhCorreo] "
                    + "  FROM [dbo].[sadRecursoHumano] where [rhNumIden]= " + usuario.getRhNumIden() + ";";

            System.out.println("sql: " + sql);

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {

                Cliente = new SadRecursoHumano_TO(rs.getLong(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getLong(15), rs.getInt(16), rs.getInt(17), rs.getString(18), rs.getString(19), rs.getLong(20), rs.getString(21));

            }

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return Cliente;

    }

}
