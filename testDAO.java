import java.sql.SQLException;

/**
 * Created by m12002101 on 17/02/14.
 */
public class testDAO {
        public static void main ( String [] args ) throws SQLException {
            DAOEtudiant dao = DAOEtudiant.getInstance();
            Etudiant e = new Etudiant();
            e.setNomEt("Dupont");
            e.setPrenomEt("Paul");
            e.setCpEt("13100");
            e.setVilleEt("Aix-en-Provence");
            e.setAnnee(1) ;
            e.setGroupe(5) ;
            e = dao.insert(e);
            //e . setAnnee(2);
            //e . setGroupe(3);
            //boolean updateOk = dao.update(e);
        }
}
