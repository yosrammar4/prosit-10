import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet {
    private HashSet<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    // Ajouter un département
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté avec succès.");
        } else {
            System.out.println("Le département existe déjà.");
        }
    }

    // Rechercher un département par nom
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(dep -> dep.getNom().equalsIgnoreCase(nom));
    }

    // Rechercher un département par objet
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    // Supprimer un département
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println("Département supprimé avec succès.");
        } else {
            System.out.println("Le département n'existe pas.");
        }
    }

    // Afficher les départements
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département disponible.");
        } else {
            departements.forEach(System.out::println);
        }
    }

    // Trier les départements par id
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
