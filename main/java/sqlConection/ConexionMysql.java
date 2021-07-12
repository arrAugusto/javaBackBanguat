/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author agr12
 */
public class ConexionMysql {
    //VARIABLES DE CONEXION
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usser = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/ws_banguat";
    //CONSTRUCTOR DE LA CLASE
    public ConexionMysql() {
        conn = null;
        try {
            //INICIIANDO LA SESION
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usser, pass);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar " + e);
        }
    }

    //RETORNADO LA CONEXION ALA BASE DE DATOS.
    public Connection getConnection() {
        return conn;
    }

    //Desconectando de la base de datos
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Conexion Finalizada");
        }
    }
}