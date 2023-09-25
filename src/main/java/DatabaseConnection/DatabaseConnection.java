/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kiet
 */
public class DatabaseConnection {
    private static Connection conn = null;
    
    public static Connection getConnection() throws Exception {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://HAIDANG:1433;"
                    + "databaseName=PerfumeShop;"
                    + "user=sa;password=123456;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;"
                    + "sendStringParametersAsUnicode=true;");

        return conn;
    }
    }
