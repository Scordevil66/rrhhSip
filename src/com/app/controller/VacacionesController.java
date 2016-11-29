/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadEstadoCivil_TO;
import com.app.models.SadVacaciones_TO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class VacacionesController {

    Statement st;

    public List<SadVacaciones_TO> consultarVacaciones(String cedula) throws Exception {

        this.st = ConexionSQL.conexion();

        List<SadVacaciones_TO> vacaciones = new ArrayList<>();

        try {

            String sql = "SELECT [Cedula] "
                    + "      ,[Periodo] "
                    + "      ,[Fechaini] "
                    + "      ,[Fechafin] "
                    + "      ,[Tomado] "
                    + "  FROM [dbo].[sadVacaciones] where [Cedula] = '" + cedula + "' ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                vacaciones.add(new SadVacaciones_TO(rs.getString(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getInt(5)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return vacaciones;

    }

    public SadVacaciones_TO consultarVacacionesIdependiente(String cedula, int periodo, Date fechaIni, Date fechaFin) throws Exception {

        this.st = ConexionSQL.conexion();

        SadVacaciones_TO vacaciones = new SadVacaciones_TO();

        try {

            String sql = "SELECT [Cedula] "
                    + "      ,[Periodo] "
                    + "      ,[Fechaini] "
                    + "      ,[Fechafin] "
                    + "      ,[Tomado] "
                    + "  FROM [dbo].[sadVacaciones] where [Cedula] = '" + cedula + "' and [Periodo] = " + periodo + " and [Fechaini] = '" + fechaIni + "' and [Fechafin] = '" + fechaFin + "' ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                vacaciones = new SadVacaciones_TO(rs.getString(1), rs.getInt(2), rs.getDate(3), rs.getDate(4), rs.getInt(5));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return vacaciones;

    }

    public void editarVacaciones(String cedula, int periodo, int nPeriodo, String fechaIni, String nFechaIni, String fechaFin, String nFechaFin, int tomado) throws Exception {

        this.st = ConexionSQL.conexion();

        try {

            String sql = "UPDATE [dbo].[sadVacaciones] "
                    + "   SET  [Periodo] = " + nPeriodo
                    + "      ,[Fechaini] = '" + nFechaIni + "'"
                    + "      ,[Fechafin] = '" + nFechaFin + "'"
                    + "      ,[Tomado] = " + tomado
                    + "   where [Cedula] = '" + cedula + "' and [Periodo] = " + periodo + " and [Fechaini] = '" + fechaIni + "' and [Fechafin] = '" + fechaFin + "' ;";

            ResultSet rs = null;

            st.executeUpdate(sql);

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

    }

    public void eliminarVacaciones(String cedula) throws Exception {

        this.st = ConexionSQL.conexion();

        try {

            String sql = "  DELETE FROM[dbo].[sadVacaciones] "
                    + "   where [Cedula] = '" + cedula + "'  ;";

            st.execute(sql);

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

    }

    public void insertarVacaciones(String cedula, int periodo, String fechaIni, String fechaFin, int tomado) throws Exception {

        this.st = ConexionSQL.conexion();

        try {

            String sql = "INSERT INTO [dbo].[sadVacaciones] "
                    + "           ([Cedula] "
                    + "           ,[Periodo] "
                    + "           ,[Fechaini] "
                    + "           ,[Fechafin] "
                    + "           ,[Tomado]) "
                    + "     VALUES "
                    + "           ('" + cedula + "'"
                    + "           ," + periodo
                    + "           ,'" + fechaIni + "'"
                    + "           ,'" + fechaFin + "'"
                    + "           ," + tomado + ") ;";

            ResultSet rs = null;

            st.execute(sql);

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

    }

}
