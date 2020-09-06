/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexMysql {
    Connection con;//atributo
    String nombreInstancia;
    String nombreBD;
    String puerto;
    String nombreUsuario;
    String password;

    public ConexMysql(String nombreInstancia, String nombreBD, String puerto, String nombreUsuario, String password) {
        this.nombreInstancia = nombreInstancia;
        this.puerto = puerto;
        this.nombreBD = nombreBD;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    
    
    
    public boolean probarConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://"+nombreInstancia+":"+puerto+"/"+ nombreBD+"?autoReconnect=true&useSSL=false",nombreUsuario,password);
            return true;//if program reach this point
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR: "+e);
            return false;//else, error
        }
    }
    
    
}
