/**
 * Created by m12002101 on 10/02/14.
 */
public class Prof {
    private int numProf;
    private String nomProf;
    private String prenomProf;
    private String adrProf;
    private String cpProf;
    private String villeProf;
    private Module specialiste;

    public Prof() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prof prof = (Prof) o;

        if (numProf != prof.numProf) return false;
        if (adrProf != null ? !adrProf.equals(prof.adrProf) : prof.adrProf != null) return false;
        if (cpProf != null ? !cpProf.equals(prof.cpProf) : prof.cpProf != null) return false;
        if (nomProf != null ? !nomProf.equals(prof.nomProf) : prof.nomProf != null) return false;
        if (prenomProf != null ? !prenomProf.equals(prof.prenomProf) : prof.prenomProf != null) return false;
        if (villeProf != null ? !villeProf.equals(prof.villeProf) : prof.villeProf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numProf;
        result = 31 * result + (nomProf != null ? nomProf.hashCode() : 0);
        result = 31 * result + (prenomProf != null ? prenomProf.hashCode() : 0);
        result = 31 * result + (adrProf != null ? adrProf.hashCode() : 0);
        result = 31 * result + (cpProf != null ? cpProf.hashCode() : 0);
        result = 31 * result + (villeProf != null ? villeProf.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Prof{" +
                "numProf=" + numProf +
                ", nomProf='" + nomProf + '\'' +
                ", prenomProf='" + prenomProf + '\'' +
                ", adrProf='" + adrProf + '\'' +
                ", cpProf='" + cpProf + '\'' +
                ", villeProf='" + villeProf + '\'' +
                ", specialite='" + specialiste.toString() + '\'' +
                '}';
    }

    public int getNumProf() {
        return numProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getAdrProf() {
        return adrProf;
    }

    public void setAdrProf(String adrProf) {
        this.adrProf = adrProf;
    }

    public String getCpProf() {
        return cpProf;
    }

    public void setCpProf(String cpProf) {
        this.cpProf = cpProf;
    }

    public String getVilleProf() {
        return villeProf;
    }

    public void setVilleProf(String villeProf) {
        this.villeProf = villeProf;
    }

    public Module getSpecialiste() {
        return this.specialiste;
    }

    public void setSpecialiste(Module specialiste) {
        this.specialiste = specialiste;
    }
}
