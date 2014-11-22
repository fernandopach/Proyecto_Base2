/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author T-202
 */
public class DAOPelicula {

    public static String guardarPelicula(String titulo, String sinopsis) throws Exception{
    Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call guardar_pelicula(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,titulo);
        callate.setString(3,sinopsis);
      
        callate.execute();
        int pk=callate.getInt(1);
        return "Se guardo la pelicula con id"+pk;   
}
}