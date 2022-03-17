package exerciceclass.com.supinfo.java.chap1;

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

    public static void main(String[] args) {
        Salle centrino = new Salle();

        centrino.setId(1);
        centrino.setNom("Centrino");
        centrino.setLocalisation("La salle du milieu");
        centrino.setCapacite(20);

        System.out.println(centrino);
    }

    @Override
    public String toString() {
        return "Salle [capacite=" + capacite + ", id=" + id + ", localisation=" + localisation + ", nom=" + nom + "]";
    }

}
