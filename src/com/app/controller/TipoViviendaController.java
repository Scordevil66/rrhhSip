/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadCiudadDepto_TO;
import com.app.models.SadTipoVivienda_TO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TipoViviendaController {

    Statement st;

    public TipoViviendaController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<SadTipoVivienda_TO> consultarTipoVivienda() throws Exception {
        
        this.st = ConexionSQL.conexion();

        List<SadTipoVivienda_TO> tViviendas = new ArrayList<>();

        try {

            String sql = "SELECT [stvCodigo]"
                    + "      ,[stvDescripcion]"
                    + "  FROM [dbo].[sadTipoVivienda];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                tViviendas.add(new SadTipoVivienda_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return tViviendas;

    }

    public SadTipoVivienda_TO consultarTipoViviendaNombre(String nombre) throws Exception {
        
        this.st = ConexionSQL.conexion();

        SadTipoVivienda_TO tVivienda = new SadTipoVivienda_TO();

        try {

            String sql = " SELECT [stvCodigo] "
                    + "      ,[stvDescripcion] "
                    + "  FROM [dbo].[sadTipoVivienda] where [stvDescripcion] = '"+nombre+"';";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                tVivienda = new SadTipoVivienda_TO(rs.getInt(1), rs.getString(2));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return tVivienda;

    }
}
