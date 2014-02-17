/**
 * Created by m12002101 on 10/02/14.
 */
public class Etudiant {
    private int numEt;
    private String nomEt;
    private String prenomEt;
    private String cpEt;
    private String villeEt;
    private int annee;
    private int groupe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Etudiant etudiant = (Etudiant) o;

        if (annee != etudiant.annee) return false;
        if (groupe != etudiant.groupe) return false;
        if (numEt != etudiant.numEt) return false;
        if (cpEt != null ? !cpEt.equals(etudiant.cpEt) : etudiant.cpEt != null) return false;
        if (nomEt != null ? !nomEt.equals(etudiant.nomEt) : etudiant.nomEt != null) return false;
        if (prenomEt != null ? !prenomEt.equals(etudiant.prenomEt) : etudiant.prenomEt != null) return false;
        if (villeEt != null ? !villeEt.equals(etudiant.villeEt) : etudiant.villeEt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numEt;
        result = 31 * result + (nomEt != null ? nomEt.hashCode() : 0);
        result = 31 * result + (prenomEt != null ? prenomEt.hashCode() : 0);
        result = 31 * result + (cpEt != null ? cpEt.hashCode() : 0);
        result = 31 * result + (villeEt != null ? villeEt.hashCode() : 0);
        result = 31 * result + annee;
        result = 31 * result + groupe;
        return result;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numEt=" + numEt +
                ", nomEt='" + nomEt + '\'' +
                ", prenomEt='" + prenomEt + '\'' +
                ", cpEt='" + cpEt + '\'' +
                ", villeEt='" + villeEt + '\'' +
                ", annee=" + annee +
                ", groupe=" + groupe +
                '}';
    }

    public Etudiant() {
    }

    public int getNumEt() {
        return numEt;
    }

    public void setNumEt(int numEt) {
        this.numEt = numEt;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public String getCpEt() {
        return cpEt;
    }

    public void setCpEt(String cpEt) {
        this.cpEt = cpEt;
    }

    public String getVilleEt() {
        return villeEt;
    }

    public void setVilleEt(String villeEt) {
        this.villeEt = villeEt;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }
}
