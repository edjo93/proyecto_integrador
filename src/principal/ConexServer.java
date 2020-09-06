/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConexServer {
    Connection conServer;
    String nombreInstancia;
    String nombreBD;
    String puerto;
    String nombreUsuario;
    String password;

    public ConexServer(String nombreInstancia, String nombreBD, String puerto, String nombreUsuario, String password) {
        this.nombreInstancia = nombreInstancia;
        this.nombreBD = nombreBD;
        this.puerto = puerto;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    

   
    
    
    public boolean probarConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            conServer=DriverManager.getConnection("jdbc:sqlserver://"+nombreInstancia+":"+puerto+";"+"databaseName="+nombreBD,nombreUsuario,password);
            return true;//if program reach this point
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR: "+e);
            return false;//else, error
        }
    }
    // old string   conServer=DriverManager.getConnection("jdbc:sqlserver://sqlserverdb.cdvj4u1rep19.us-east-1.rds.amazonaws.com:1433;databaseName=" + "projectmysql","admin","adminsqlserver");
    
    
    
    
    
        
    
    
    
    
    
    
    
}
