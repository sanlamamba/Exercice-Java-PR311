package exercice.com.supinfo.java.chap1;

import java.time.LocalDate;

public class Groupe {

    private int id;
    private String nom;
    private LocalDate dateCreation;

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

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Groupe [dateCreation=" + dateCreation + ", id=" + id + ", nom=" + nom + "]";
    }

    public static void main(String[] args) {
        Groupe groupe = new Groupe();

        LocalDate dateCreation = LocalDate.parse("2021-12-05");
        groupe.setId(311);
        groupe.setNom("PR311");
        groupe.setDateCreation(dateCreation);

        System.out.println(groupe);
    }
}
