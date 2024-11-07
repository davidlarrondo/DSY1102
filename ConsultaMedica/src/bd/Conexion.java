/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author vina
 */
public class Conexion {
    
    public static Connection getConectar(){
        
        Connection connect = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/paciente";
            String user = "root";
            String pass="";
            Class.forName(driverClassName);
            connect = DriverManager.getConnection(url,user,pass);
            System.out.println("BD CONECTADA");
        } catch (Exception e) {
            System.out.println(e);
            System.err.println("ERROR DE CONEXIÓN");
                   
        }
        return connect;
        
    }
    
}
