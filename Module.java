/**
 * Created by m12002101 on 10/02/14.
 */
public class Module {
    private String code;
    private String libelle;
    private int hCoursPrev;
    private int hCoursRea;
    private int hTpPrev;
    private int hTpRea;
    private String discipline;
    private int coefTest;
    private int coefCc;
    private Prof responsable;
    private Module pere;

    public Module getPere() {
        return pere;
    }

    public void setPere(Module pere) {
        this.pere = pere;
    }

    public Prof getResponsable() {
        return responsable;
    }

    public void setResponsable(Prof responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", hCoursPrev=" + hCoursPrev +
                ", hCoursRea=" + hCoursRea +
                ", hTpPrev=" + hTpPrev +
                ", hTpRea=" + hTpRea +
                ", discipline='" + discipline + '\'' +
                ", coefTest=" + coefTest +
                ", coefCc=" + coefCc +
                ", responsable=" + responsable +
                ", pere=" + pere +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Module module = (Module) o;

        if (coefCc != module.coefCc) return false;
        if (coefTest != module.coefTest) return false;
        if (hCoursPrev != module.hCoursPrev) return false;
        if (hCoursRea != module.hCoursRea) return false;
        if (hTpPrev != module.hTpPrev) return false;
        if (hTpRea != module.hTpRea) return false;
        if (code != null ? !code.equals(module.code) : module.code != null) return false;
        if (discipline != null ? !discipline.equals(module.discipline) : module.discipline != null) return false;
        if (libelle != null ? !libelle.equals(module.libelle) : module.libelle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + hCoursPrev;
        result = 31 * result + hCoursRea;
        result = 31 * result + hTpPrev;
        result = 31 * result + hTpRea;
        result = 31 * result + (discipline != null ? discipline.hashCode() : 0);
        result = 31 * result + coefTest;
        result = 31 * result + coefCc;
        return result;
    }

    public Module() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int gethCoursPrev() {
        return hCoursPrev;
    }

    public void sethCoursPrev(int hCoursPrev) {
        this.hCoursPrev = hCoursPrev;
    }

    public int gethCoursRea() {
        return hCoursRea;
    }

    public void sethCoursRea(int hCoursRea) {
        this.hCoursRea = hCoursRea;
    }

    public int gethTpPrev() {
        return hTpPrev;
    }

    public void sethTpPrev(int hTpPrev) {
        this.hTpPrev = hTpPrev;
    }

    public int gethTpRea() {
        return hTpRea;
    }

    public void sethTpRea(int hTpRea) {
        this.hTpRea = hTpRea;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getCoefTest() {
        return coefTest;
    }

    public void setCoefTest(int coefTest) {
        this.coefTest = coefTest;
    }

    public int getCoefCc() {
        return coefCc;
    }

    public void setCoefCc(int coefCc) {
        this.coefCc = coefCc;
    }
}
