package entities;

import interfaces.IDepartement;

import java.util.Objects;

public class Departement  {
    private int id;
    private String nom;
    private int nbrEmployees;

    public Departement(){}
    public Departement(int id, String nom, int nbrEmployees){
        this.id = id;
        this.nom = nom;
        this.nbrEmployees = nbrEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrEmployees() {
        return nbrEmployees;
    }

    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return false;
        if (o instanceof Departement departement)
        {
            return (id == departement.id) &&
                    (Objects.equals(nom, departement.getNom()));
        }
        return false;
        }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrEmployees=" + nbrEmployees +
                '}';
    }
}
