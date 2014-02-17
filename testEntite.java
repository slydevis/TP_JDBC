import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by m12002101 on 10/02/14.
 */
public class testEntite {
    static final String req = " SELECT *" + " FROM ETUDIANT " + " WHERE VILLE_ET='AIX-EN-PROVENCE'" ;
    public static void main(String [] argv) throws SQLException
    {
        try {
            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println( " Execution de la requete : " + req );
            ResultSet resultSet = statement.executeQuery(req);
            ArrayList<Etudiant> EtudList = new ArrayList<Etudiant>();
            while (resultSet.next()) {
                Etudiant Et = new Etudiant();
                Et.setNumEt(resultSet.getInt("NUM_ET"));
                Et.setNomEt(resultSet.getString("NOM_ET"));
                Et.setPrenomEt(resultSet.getString("PRENOM_ET"));
                Et.setCpEt(resultSet.getString("CP_ET"));
                Et.setVilleEt(resultSet.getString("VILLE_ET"));
                Et.setAnnee(resultSet.getInt("ANNEE"));
                Et.setGroupe(resultSet.getInt("GROUPE"));
                EtudList.add(Et);
             }
            // On affiche le tous

            System.out.println(EtudList);

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
