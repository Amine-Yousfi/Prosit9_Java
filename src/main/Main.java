package main;

import entities.Employee;
import entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();

        // Add some employees
        Employee emp1 = new Employee(1, "Yousfi", "Amine", "IT", 2);
        Employee emp2 = new Employee(2, "Messi", "Leo", "HR", 3);
        Employee emp3 = new Employee(3, "Ronaldo", "Cristiano", "Finance", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Display all employees
        System.out.println("All Employees:");
        societe.displayEmploye();
        System.out.println();

        // Search for an employee by name
        String searchName = "Yousfi";
        System.out.println("Searching for employee with name " + searchName + ": "
                + societe.rechercherEmploye(searchName));
        System.out.println();

        // Search for an employee by reference
        System.out.println("Searching for employee by reference: " + societe.rechercherEmploye(emp2));
        System.out.println();

        // Sort employees by ID
        System.out.println("Sorting employees by ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println();

        // Sort employees by department and grade
        System.out.println("Sorting employees by department and grade:");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
