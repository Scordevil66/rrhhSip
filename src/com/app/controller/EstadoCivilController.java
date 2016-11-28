/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadCiudadDepto_TO;
import com.app.models.SadEstadoCivil_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EstadoCivilController {

    Statement st;

    public List<SadEstadoCivil_TO> consultarEstadoCivil() throws Exception {

        this.st = ConexionSQL.conexion();

        List<SadEstadoCivil_TO> Estados = new ArrayList<>();

        try {

            String sql = "SELECT [secCodigo] "
                    + "      ,[secDescripcion] "
                    + "  FROM [dbo].[sadEstadoCivil];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                Estados.add(new SadEstadoCivil_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return Estados;

    }

}
