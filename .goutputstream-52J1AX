/**
 * Created by m12002101 on 03/02/14.
 */

import java.sql.*;

public class ConnexionUnique {

    private Connection connection = null;
    private static ConnexionUnique instance = new ConnexionUnique();
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/BDEtud";

    private ConnexionUnique()
    {
        connection = null;
        try {
            System.out.println (" Connexion a " + CONNECT_URL) ;
            connection = DriverManager.getConnection(CONNECT_URL, "root", "mysql");
            System.out.println ( " Connecte \n" );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection()
    {
        return this.connection;
    }

    public static ConnexionUnique getInstance()
    {
        return instance;
    }
}