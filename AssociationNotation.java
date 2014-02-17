import java.util.HashSet;
import java.util.Set;

/**
 * Created by m12002101 on 10/02/14.
 */
public class AssociationNotation {

    private static AssociationNotation instance = new AssociationNotation();
    private Set<Lien> liens;
    private AssociationNotation(){
        liens = new HashSet<Lien>();
    }

    @Override
    public String toString() {
        return "AssociationNotation{" +
                "liens=" + liens +
                '}'+ '\n';
    }

    public void creerLien(Module mod, Etudiant et, Notation not)
    {
        Lien liens = new Lien(mod,et);
        liens.setNotation(not);
        this.liens.add(liens);
    }

    public void supprimerLien(Module mod, Etudiant et)
    {
        this.liens.remove(new Lien(mod,et));
    }

    public void suprimerLien(Lien lien)
    {
        this.liens.remove(lien);
    }

    public Lien getLien(Module mod, Etudiant et)
    {
        for (Lien lien : this.liens) {
            if(lien.getEtudiant().equals(et) && lien.getModule().equals(mod))
            return lien;
        }
        return null;
    }

    public Set<Lien> getLiens(Module mod)
    {
        Set<Lien> SetLiens = new HashSet<Lien>();
        for(Lien lien : this.liens)
        {
            if(lien.getModule().equals(mod)) SetLiens.add(lien);
        }
        return SetLiens;
    }

    public Set<Lien> getLiens(Etudiant et)
    {
        Set<Lien> SetLiens = new HashSet<Lien>();
        for(Lien lien : this.liens){
            if(lien.getEtudiant().equals(et))
                SetLiens.add(lien);
        }
        return SetLiens;
    }

    public Set<Module> getModules(Etudiant et)
    {
        Set<Module> SetModules = new HashSet<Module>();
        for(Lien lien : this.liens)
        {
            if(lien.getEtudiant().equals(et))
                SetModules.add(lien.getModule());
        }
        return SetModules;
    }
    public Set<Etudiant> getEtudiants(Module mod)
    {
        Set<Etudiant> SetEtu = new HashSet<Etudiant>();
        for(Lien lien : this.liens)
        {
            if(lien.getModule().equals(mod))
                SetEtu.add(lien.getEtudiant());
        }
        return SetEtu;
    }

    public static AssociationNotation getInstance()
    {
        return instance;
    }

}
