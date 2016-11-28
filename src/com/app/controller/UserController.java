/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.conexion.ConexionSQL;
import com.app.models.SadRecursoHumano_TO;
import java.sql.SQLException;
import java.sql.Statement;

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

        try {

//            String sql = "INSERT INTO `sadrecursohumano` (`rhNumIden`,"
//                    + " `rhCodDeptoIden`, `rhCodCiudadIden`, `rhFchIngreso`,"
//                    + " `rhNombres`, `rhApellido1`, `rhApellido2`, "
//                    + "`rhCodSexo`, `rhCodEstCivil`, `rhDireccion`,"
//                    + " `rhBarrio`, `rhFchNacimiento`, `rhCodDeptoOrigen`, "
//                    + "`rhCodCiudadOrigen`, `rhTelefono`, `rhCelular`,"
//                    + " `rhCodTipVivienda`, `rhEstrato`, `rhLibretaMilitar`, "
//                    + "`rhDistrito`, `rhClase`, `rhGrupoSang`, `rhRH`, "
//                    + "`rhCodCargo`, `rhCodDeptoCargo`, `rhCodCiudadCargo`,"
//                    + " `rhNombreEmergencia`, `rhTelEmergencia`, `rhCodCcosto`, "
//                    + "`rhMedsAlergico`, `rhImagen`, `rhCodEstado`, `rhCorreo`)"
//                    + " VALUES ('"+usuario.getRhNumIden()+"', NULL,"
//                    + " NULL, NULL,"
//                    + " '"+usuario.getRhNombres()+"', '"+usuario.getRhApellido1()+"', "
//                    + "'"+usuario.getRhApellido2()+"', NULL, "
//                    + "NULL, '"+usuario.getRhDireccion()+"',"
//                    + " '"+usuario.getRhBarrio()+"', NULL,"
//                    + " NULL, NULL,"
//                    + " '"+usuario.getRhTelefono()+"', '"+usuario.getRhCelular()+"',"
//                    + " NULL, NULL,"
//                    + " NULL, NULL,"
//                    + " NULL, NULL,"
//                    + " NULL, NULL,"
//                    + " NULL, NULL,"
//                    + " '"+usuario.getRhNombreEmergencia()+"', '"+usuario.getRhTelEmergencia()+"',"
//                    + " NULL, NULL,"
//                    + " NULL, '',"
//                    + " '"+usuario.getRhCorreo()+"');";
            String sql = "INSERT INTO [dbo].[sadRecursoHumano] "
                    + "           ([rhNumIden] "
                    + "           ,[rhCodDeptoIden]"
                    + "           ,[rhCodCiudadIden]"
                    + "           ,[rhNombres]"
                    + "           ,[rhApellido1]"
                    + "           ,[rhApellido2]"
                    //                    + "           ,[rhCodSexo]"
                    + "           ,[rhCodEstCivil]"
                    + "           ,[rhDireccion]"
                    + "           ,[rhBarrio]"
                    //                    + "           ,[rhFchNacimiento]"
                    + "           ,[rhCodDeptoOrigen]"
                    + "           ,[rhCodCiudadOrigen]"
                    + "           ,[rhTelefono]"
                    + "           ,[rhCelular]"
                    + "           ,[rhCodTipVivienda]"
                    + "           ,[rhEstrato]"
                    //                    + "           ,[rhGrupoSang]"
                    //                    + "           ,[rhRH]"
                    + "           ,[rhCodEstado]"
                    + "           ,[rhCorreo])"
                    + "     VALUES "
                    + "           (" + usuario.getRhNumIden()
                    + "           ," + usuario.getRhCodDeptoIden()
                    + "           ," + usuario.getRhCodCiudadIden()
                    + "           ,'" + usuario.getRhNombres()
                    + "'           ,'" + usuario.getRhApellido1()
                    + "'           ,'" + usuario.getRhApellido2()
                    //                    + "           ,<rhCodSexo, tinyint,>"
                    + "'           ," + usuario.getRhCodEstCivil()
                    + "           ,'" + usuario.getRhDireccion()
                    + "'           ,'" + usuario.getRhBarrio()
                    //                    + "           ,<rhFchNacimiento, datetime,>"
                    + "'           ," + usuario.getRhCodDeptoOrigen()
                    + "           ," + usuario.getRhCodCiudadOrigen()
                    + "           ," + usuario.getRhTelefono()
                    + "           ," + usuario.getRhCelular()
                    + "           ," + usuario.getRhCodTipVivienda()
                    + "           ," + usuario.getRhEstrato()
                    //                    + "           ,rhGrupoSang, varchar(2),>"
                    //                    + "           ,rhRH, varchar(1),>"
                    + "           ," + usuario.getRhCodEstado()
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

}
