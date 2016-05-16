package Helpers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.System.exit;
import static java.sql.DriverManager.getConnection;

/**
 * Created by kiryshkov on 12.05.2016.
 */
public class DBHelper extends ApplicationManager {

    public Connection initDBConnection() throws SQLException, IOException {
        Properties config = new Properties();
        java.lang.String target = config.getProperty("target", "dbreader");
        config.load(new FileReader(new File(java.lang.String.format("src/test/resources/%s.properties", target))));
        String host = config.getProperty("host");
        int port = Integer.parseInt(config.getProperty("port"));
        String sid = config.getProperty("sid");
        String user = config.getProperty("BSSDB5");
        String pwd = config.getProperty("BSSDB5");


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver is not found");
            e.printStackTrace();
            exit(-1);
        }
        java.lang.String url = java.lang.String.format("jdbc:oracle:thin:@%s:%d:%s", host, port, sid);

        Connection connection = null;
        try {
            connection = getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println("Connection Failed : " + e.getMessage());
            exit(-1);
        }
        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
        //connection.close();
    }

}