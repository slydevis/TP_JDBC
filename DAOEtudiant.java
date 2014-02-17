import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
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
        Maximum++;
        String req = "INSERT INTO ETUDIANT (NUM_ET, ANNEE, CP_ET, GROUPE, NOM_ET, PRENOM_ET, VILLE_ET)" +
                " VALUES("+Maximum+","+et.getAnnee()+",'"+et.getCpEt()+"',"+et.getGroupe()+
                                                     ",'"+et.getNomEt()+"','"+et.getPrenomEt()+"','"+et.getVilleEt()+"')";
        System.out.println( " Execution de la requete : " + req );
        Statement statement1 = conne.createStatement();
        int NbRow = statement1.executeUpdate(req);
        System.out.println(NbRow + " tuple insere ");
        et.setNumEt(Maximum);
        return et;
    }

    public boolean delete(Etudiant et) {
        try
        {
            String req = "DELETE FROM ETUDIANT WHERE NUM_ET="+et.getNumEt();
            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println("Execution de la requete : " + req);
            int NbRow = statement.executeUpdate(req);
            System.out.println(NbRow + " tuple detruit");
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean update(Etudiant et) {
        try {
            String req = "UPDATE ETUDIANT SET NOM_ET='"+et.getNomEt() + "', PRENOM_ET='"+et.getPrenomEt()
                    +"',CP_ET='"+et.getCpEt()+"', VILLE_ET='"+et.getVilleEt()+"',ANNEE="+ et.getAnnee() +",GROUPE="
                    +et.getGroupe() + " WHERE NUM_ET=" + et.getNumEt();

            ConnexionUnique conneU = ConnexionUnique.getInstance();
            Connection conne = (Connection) conneU.getConnection();
            Statement statement = conne.createStatement();
            System.out.println("Execution de la requete : " + req);
            int NbRow = statement.executeUpdate(req);
            System.out.println(NbRow + " tuple modifiés");
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public Etudiant getById(int numEt) throws SQLException {
        String req = "SELECT * FROM ETUDIANT WHERE NUM_ET="+numEt;
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( " Execution de la requete : " + req );
        ResultSet resultSet = statement.executeQuery(req);
        if(!resultSet.next())  return null;
        Etudiant et = new Etudiant(resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                    resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                    resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE"));
        return et;
    }

    public List<Etudiant> findAll() throws SQLException {
        List<Etudiant> lEtu = new LinkedList<Etudiant>();
        String req = "SELECT * FROM ETUDIANT";
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( "Execution de la requete : " + req );
        ResultSet resultSet = statement.executeQuery(req);

        while (resultSet.next()) {
            Etudiant et = new Etudiant(
                    resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                    resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                    resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE")
            );
            lEtu.add(et);
        }
        return lEtu;
    }

    public List<Etudiant> findByNom(String NomEt) throws SQLException {
        List<Etudiant> lEtu = new LinkedList<Etudiant>();
        String req = "SELECT * FROM ETUDIANT WHERE NOM_ET='"+NomEt+"'";
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( "Execution de la requete : " + req );
        ResultSet resultSet = statement.executeQuery(req);

        while (resultSet.next()) {
            Etudiant et = new Etudiant(
                    resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                    resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                    resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE")
            );
            lEtu.add(et);
        }
        return lEtu;
    }

    public List<Etudiant> findByGroupe(int Groupe) throws SQLException {
        List<Etudiant> lEtu = new LinkedList<Etudiant>();
        String req = "SELECT * FROM ETUDIANT WHERE GROUPE="+Groupe;
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( "Execution de la requete : " + req );
        ResultSet resultSet = statement.executeQuery(req);

        while (resultSet.next()) {
            Etudiant et = new Etudiant(
                    resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                    resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                    resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE")
            );
            lEtu.add(et);
        }
        return lEtu;
    }

    public List<Etudiant>findByAnnee(int Annee) throws SQLException {
        List<Etudiant> lEtu = new LinkedList<Etudiant>();
        String req = "SELECT * FROM ETUDIANT WHERE ANNEE="+Annee;
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( "Execution de la requete : " + req );
        ResultSet resultSet = statement.executeQuery(req);

        while (resultSet.next()) {
            Etudiant et = new Etudiant(
                    resultSet.getString("NOM_ET"), resultSet.getInt("NUM_ET"), resultSet.getString("PRENOM_ET"),
                    resultSet.getString("CP_ET"), resultSet.getString("VILLE_ET"),
                    resultSet.getInt("ANNEE"), resultSet.getInt("GROUPE")
            );
            lEtu.add(et);
        }
        return lEtu;
    }

    public float computeMoyennePonderee(Etudiant et) throws SQLException {
        String req = "SELECT AVG((MOY_CC*COEFF_CC + MOY_TEST*COEFF_TEST)/(COEFF_CC+COEFF_TEST)) " +
                "FROM NOTATION N, MODULE M WHERE NUM_ET="+et.getNumEt();
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( " Execution de la requete : " + req);
        ResultSet resultSet = statement.executeQuery(req);
        resultSet.next();
        return resultSet.getFloat(1);

    }

    public int computeNbEtudiant() throws SQLException {
        String req = "SELECT COUNT(NUM_ET) FROM ETUDIANT";
        ConnexionUnique conneU = ConnexionUnique.getInstance();
        Connection conne = (Connection) conneU.getConnection();
        Statement statement = conne.createStatement();
        System.out.println( " Execution de la requete : " + req);
        ResultSet resultSet = statement.executeQuery(req);
        resultSet.next();
        return resultSet.getInt(1);
    }

    public static DAOEtudiant getInstance(){
        return instance;
    }

}
