import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by m12002101 on 10/02/14.
 */
public class testAsso1 {
    static final String req = " SELECT *" + " FROM PROF, MODULE " + " WHERE MAT_SPEC=CODE" ;
    public static void main(String [] argv) throws SQLException
    {
        try {
            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println( " Execution de la requete : " + req );
            ResultSet resultSet = statement.executeQuery(req);
            ArrayList<Prof> ProfList = new ArrayList<Prof>();
            while (resultSet.next()) {

                Prof Pf = new Prof();
                Pf.setNumProf(resultSet.getInt("NUM_PROF"));
                Pf.setNomProf(resultSet.getString("NOM_PROF"));
                Pf.setPrenomProf(resultSet.getString("PRENOM_PROF"));
                Pf.setAdrProf(resultSet.getString("ADR_PROF"));
                Pf.setCpProf(resultSet.getString("CP_PROF"));
                Pf.setVilleProf(resultSet.getString("VILLE_PROF"));

                Module Mod = new Module();
                Mod.setCode(resultSet.getString("CODE"));
                Mod.setLibelle(resultSet.getString("LIBELLE"));
                Mod.sethCoursPrev(resultSet.getInt("H_COURS_PREV"));
                Mod.sethCoursRea(resultSet.getInt("H_COURS_REA"));
                Mod.sethTpPrev(resultSet.getInt("H_TP_PREV"));
                Mod.sethTpRea(resultSet.getInt("H_TP_REA"));
                Mod.setDiscipline(resultSet.getString("DISCIPLINE"));
                Mod.setCoefTest(resultSet.getInt("COEFF_TEST"));
                Mod.setCoefCc(resultSet.getInt("COEFF_CC"));

                Pf.setSpecialiste(Mod);

                ProfList.add(Pf);
            }
            // On affiche le tous

            System.out.println(ProfList);

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
