package Collections;

import entities.Departement;
import interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    public Set<Departement> listOfDep;

    public DepartementHashSet(){
        listOfDep = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        listOfDep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement dep : listOfDep){
            if(dep.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return listOfDep.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        listOfDep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement dep : listOfDep){
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sortedSet.addAll(listOfDep);
        return sortedSet;
    }

}
