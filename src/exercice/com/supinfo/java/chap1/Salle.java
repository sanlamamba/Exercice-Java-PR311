package exercice.com.supinfo.java.chap1;

public class Salle {
    private int id;
    private String nom;
    private String localisation;
    private int capacite;

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

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Salle [capacite=" + capacite + ", id=" + id + ", localisation=" + localisation + ", nom=" + nom + "]";
    }

    public static void main(String[] args) {
        Salle salle = new Salle();

        salle.setId(1);
        salle.setNom("Centrino");
        salle.setLocalisation("La salle du milieu");
        salle.setCapacite(20);

        System.out.println(salle);
    }

}
