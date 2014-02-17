import java.util.Set;

/**
 * Created by m12002101 on 10/02/14.
 */
public class AssociationNotation {

    private static AssociationNotation instance = new AssociationNotation();
    private Set<Lien> liens;
    private AssociationNotation(){}

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

        }
    }

    public Set<Lien> getLiens(Module mod)
    {

    }

    public Set<Lien> getLiens(Etudiant et)
    {

    }

    public Set<Module> getModules(Etudiant et)
    {

    }
    public Set<Etudiant> getEtudiants(Module mod)
    {

    }

    public static AssociationNotation getInstance()
    {
        return instance;
    }

}
