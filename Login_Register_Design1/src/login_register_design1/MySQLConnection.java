/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design1;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mkino
 */
public class MySQLConnection {
    
    private static String servername = "localhost";
    private static String username = "Kinoti";
   
    private static String database = "solar_system";
    private static int portnumber = 3308;
    private static String password = "";
    

    public MySQLConnection() {
    }
    
    public static Connection getConnection()
    {
    
        Connection connect = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(database);
        datasource.setPortNumber( portnumber);
        
        try
        {
          
            connect = datasource.getConnection();
        } catch (SQLException exception)
        {
           Logger.getLogger("Get Connection -> "+ MySQLConnection.class.getName()).log(Level.SEVERE,null,exception);
        
        }
        
        return connect;
    }
    
}
