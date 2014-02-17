/**
 * Created by m12002101 on 10/02/14.
 */
public class Lien {
    private Module module;
    private Etudiant etudiant;
    private Notation note;

    public Lien(Module mod, Etudiant et)
    {
        this.module = mod;
        this.etudiant = et;
        this.note = new Notation();
    }

    public Module getModule()
    {
        return this.module;
    }

    public Etudiant getEtudiant()
    {
        return this.etudiant;
    }

    public Notation getNotation()
    {
        return this.note;
    }

    public Lien getLien(Module mod, Etudiant et)
    {
        return this;
    }

    public void setNotation(Notation note)
    {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lien lien = (Lien) o;

        if (etudiant != null ? !etudiant.equals(lien.etudiant) : lien.etudiant != null) return false;
        if (module != null ? !module.equals(lien.module) : lien.module != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = module != null ? module.hashCode() : 0;
        result = 31 * result + (etudiant != null ? etudiant.hashCode() : 0);
        return result;
    }
}
