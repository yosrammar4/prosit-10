//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 30);
        Departement d3 = new Departement(3, "Finance", 20);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        gestionDepartements.displayDepartement();

        System.out.println("Recherche par nom : " + gestionDepartements.rechercherDepartement("Finance"));
        System.out.println("Tri par id : " + gestionDepartements.trierDepartementById());
    }
}
