/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/integradora";
    public static final String USER = "root";
    public static final String CLAVE = "";
        
    public Connection getConexion(){
        Connection con = null;
        try { // intenta conectarse
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE); // concatena los datos para la coneccion
            System.out.println("La conexion fue exitosa");
        } catch (Exception ex) { // si no funciona imprime el mensaje de error
            System.out.println("Error: " + ex.getMessage());
        }
        return con;
    }
}
