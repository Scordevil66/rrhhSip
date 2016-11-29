/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadEstado_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EstadoController {

    Statement st;

    public EstadoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<SadEstado_TO> consultarEstado() throws Exception {

        List<SadEstado_TO> estados = new ArrayList<>();

        try {

            String sql = "SELECT [estCodigo] "
                    + "      ,[estDescripcion] "
                    + "  FROM [dbo].[sadEstado];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                estados.add(new SadEstado_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return estados;

    }

    public SadEstado_TO consultarEstadoId(Long IdEstado) throws Exception {

        SadEstado_TO estado = new SadEstado_TO();

        try {

            String sql = "SELECT [estCodigo] "
                    + "      ,[estDescripcion] "
                    + "  FROM [dbo].[sadEstado] where [estCodigo] = "+IdEstado+" ;";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                estado = new SadEstado_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return estado;

    }

}
