/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadCargo_TO;
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
public class CargoController {

    Statement st;

    public CargoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public List<SadCargo_TO> consultarCargo() throws Exception {

        List<SadCargo_TO> cargos = new ArrayList<>();

        try {

            String sql = "SELECT [carCodigo] "
                    + "      ,[carDescripcion] "
                    + "  FROM [dbo].[sadCargo];";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                cargos.add(new SadCargo_TO(rs.getInt(1), rs.getString(2)));

            }

        } catch (SQLException e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return cargos;

    }

}
