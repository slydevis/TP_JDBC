import java.sql.SQLException;
import java.util.List;

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

            e.setAnnee(2);
            e.setGroupe(3);

            boolean updateOk = dao.update(e);

            Etudiant et2 = dao.getById(2101);

            List<Etudiant> testFindAll = dao.findAll();

            for(int i = 0; i < testFindAll.size(); ++i)
            {
                 Etudiant etu = testFindAll.get(i);
                 System.out.println(etu.toString());
            }

            List<Etudiant> testFindByNom = dao.findByNom("Dupont");

            for(int i = 0; i < testFindByNom.size(); ++i)
            {
                Etudiant etu = testFindByNom.get(i);
                System.out.println(etu.toString());
            }

            List<Etudiant> testFindByGroupe = dao.findByGroupe(4);

            for(int i = 0; i < testFindByGroupe.size(); ++i)
            {
                Etudiant etu = testFindByGroupe.get(i);
                System.out.println(etu.toString());
            }

            List<Etudiant> testFindByAnnee = dao.findByAnnee(2);

            for(int i = 0; i < testFindByAnnee.size(); ++i)
            {
                Etudiant etu = testFindByAnnee.get(i);
                System.out.println(etu.toString());
            }

            System.out.println("MOYENNE DE L'ETU = " + dao.computeMoyennePonderee(dao.getById(2406)));
            System.out.println("NB ETUDIANT = " + dao.computeNbEtudiant());

            boolean deleteOk = dao.delete(e);
        }
}
