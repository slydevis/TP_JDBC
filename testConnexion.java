
import com.mysql.jdbc.Connection;

import java.sql.SQLException;

/**
 * Created by m12002101 on 03/02/14.
 */

import java.sql.*;
import java.sql.Statement;

public class testConnexion {

    static final String req = " SELECT NUM_ET,NOM_ET,PRENOM_ET" + " FROM ETUDIANT " + " WHERE VILLE_ET='AIX-EN-PROVENCE'" ;
    public static void main(String [] argv) throws SQLException
    {
        try {
            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println( " Execution de la requete : " + req );
            ResultSet resultSet = statement.executeQuery(req);
            while (resultSet.next()) {
                System.out.print(resultSet.getInt( "NUM_ET" ) + " " );
                System.out.print(resultSet.getString ( "NOM_ET" ) + " " );
                System.out.println(resultSet.getString ( "PRENOM_ET" )) ;

            }
            System.out.println("\n Ok .\n" );
            conne.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System . out . println ( e . getMessage ( ) + "\n" ) ;
        }
    }
}