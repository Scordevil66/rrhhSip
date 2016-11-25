/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadCiudadDepto_TO;
import com.app.models.SadRecursoHumano_TO;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CiudadDeptoController {

    Statement st;

    public CiudadDeptoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<SadCiudadDepto_TO> consultarDepartamento() throws Exception {

        List<SadCiudadDepto_TO> departamentos = new ArrayList<>();

        try {

            String sql = "SELECT [cdsCodDepto]"
                    + "      ,[cdsDepto]"
                    + "  FROM [dbo].[sadCiudadDepto];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                departamentos.add(new SadCiudadDepto_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return departamentos;

    }

    public List<SadCiudadDepto_TO> consultarCiudad() throws Exception {

        List<SadCiudadDepto_TO> ciudades = new ArrayList<>();

        try {

            String sql = "SELECT [cdsCodDepto]"
                    + "      ,[cdsCodCiudad]"
                    + "      ,[cdsCiudad]"
                    + "  FROM [dbo].[sadCiudadDepto];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ciudades.add(new SadCiudadDepto_TO(rs.getInt(1), rs.getInt(2), rs.getString(3)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return ciudades;

    }

}
