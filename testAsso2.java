import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by m12002101 on 10/02/14.
 */
public class testAsso2 {
    static final String req = " SELECT *" + " FROM ETUDIANT ET, MODULE M, NOTATION N" +
                                                           " WHERE ET.NUM_ET=N.NUM_ET AND M.CODE=N.CODE";
    public static void main(String [] argv) throws SQLException
    {
        try {
            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println( " Execution de la requete : " + req );
            ResultSet resultSet = statement.executeQuery(req);
            AssociationNotation Anot = AssociationNotation.getInstance();

            while (resultSet.next()) {

                Module Mod = new Module();
                Mod.setCode(resultSet.getString("M.CODE"));

                Notation not = new Notation();

                not.setMoyCC(resultSet.getInt("MOY_CC"));
                not.setMoyTest(resultSet.getInt("MOY_TEST"));

                Etudiant et = new Etudiant(
                        resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                        resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                        resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE")
                );
                Anot.creerLien(Mod, et, not);
            }

            Module FindModule = new Module();

            FindModule.setCode("ACSI");

            System.out.println(Anot.getLiens(FindModule).toString());

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
