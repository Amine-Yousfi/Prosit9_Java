package entities;

import interfaces.IGestion;

import java.util.ArrayList;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {

    public List<Employee> listEmployees;

    public SocieteArrayList() {
        this.listEmployees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employee) {
        listEmployees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employee : listEmployees) {
            if (employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour rechercher un employé par référence
    @Override
    public boolean rechercherEmploye(Employee employee) {
        return listEmployees.contains(employee); // Utilise la méthode contains de la liste
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        listEmployees.remove(employee);
    }

    // Méthode pour afficher tous les employés de la liste
    @Override
    public void displayEmploye() {
        for (Employee employee : listEmployees) {
            System.out.println(employee);
        }
    }

    // Méthode pour trier les employés par ID
    @Override
    public void trierEmployeParId() {
        // Utilise la méthode sort avec un comparateur basé sur les IDs des employés
        listEmployees.sort((e1, e2) -> e1.getId() - e2.getId());
    }

    // Méthode pour trier les employés par nom de département et grade
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        // Utilise la méthode sort avec un comparateur basé sur le département et le grade des employés
        listEmployees.sort((e1, e2) -> {
            // Verifier si les départements des employés sont égaux
            if (e1.getNomDepartement().equals(e2.getNomDepartement())) {
                // Si les départements sont égaux, compare les grades
                return e1.getGrade() - e2.getGrade();
            } else {
                // Si les départements ne sont pas égaux, compare les noms des départements
                return e1.getNomDepartement().compareTo(e2.getNomDepartement());
            }
        });
    }

}
