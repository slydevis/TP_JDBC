import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by m12002101 on 17/02/14.
 */
public class DAOEtudiant {

    private static DAOEtudiant instance = new DAOEtudiant();

    private DAOEtudiant() {}

    public Etudiant insert(Etudiant et) throws SQLException {
        String reqMax = "SELECT MAX(NUM_ET) FROM ETUDIANT";
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( " Execution de la requete : " + reqMax );
        ResultSet resultSet = statement.executeQuery(reqMax);
        resultSet.next();
        int Maximum = resultSet.getInt(1);
        String req = "INSERT INTO ETUDIANT (NUM_ET, ANNEE, CP_ET, GROUPE, NOM_ET, PRENOM_ET, VILLE_ET)" +
                " VALUES("+Maximum+","+et.getAnnee()+",'"+et.getCpEt()+"',"+et.getGroupe()+
                                                     ",'"+et.getNomEt()+"','"+et.getPrenomEt()+"','"+et.getVilleEt()+"')";
        System.out.println( " Execution de la requete : " + req );
        Statement statement1 = conne.createStatement();
        int NbRow = statement1.executeUpdate(req);
        System.out.println(NbRow + " tuple insere ");
        return et;
    }

    public boolean delete(Etudiant et) {
        return true;
    }

    public boolean update(Etudiant et) {
        return true;
    }

    public Etudiant getById(int numEt) {
        return null;
    }

    public List<Etudiant> findAll(){
        return null;
    }

    public List<Etudiant> findByNom(String NomEt){
        return null;
    }

    public List<Etudiant> findByGroupe(int Groupe) {
        return null;
    }

    public List<Etudiant>findByAnnee(int Annee) {
        return null;
    }

    public float computeMoyennePonderee(Etudiant et) {
        return 0;
    }

    public int computeNbEtudiant() {
        return 0;
    }

    public static DAOEtudiant getInstance(){
        return instance;
    }

}
