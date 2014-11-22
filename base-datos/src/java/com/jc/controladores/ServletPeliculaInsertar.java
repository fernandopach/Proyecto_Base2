
package com.jc.controladores;

import com.jc.model.DAOPelicula;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletPeliculaInsertar extends HttpServlet {
    
   //METODO HTTP  SECUENCIAS SQL
   //POST-     INSERT DATOS
   //GET-      BUSCAR POR ID O TODOS
   //PUT-      PARA HACER EL UPDATE EN LA BASE DE DATOS
   //DELETE-   PARA BORRAR
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //PEDIMOS DATOS AL CLIENTE
        
        String titulo= request.getParameter("titulo");
        String sinopsis = request.getParameter("sinopsis");
        try{
        
       //se invoca el procedimiento
        
        out.println(DAOPelicula.guardarPelicula(titulo, sinopsis));
        
        }catch(Exception e){}
        
        }
}