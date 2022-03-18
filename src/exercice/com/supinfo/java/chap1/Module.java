package exercice.com.supinfo.java.chap1;

public class Module {
    private int id;
    private String nom;
    private String description;
    private int volumeHoraire;
    private int coefficient;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Module [coefficient=" + coefficient + ", description=" + description + ", id=" + id + ", nom=" + nom
                + ", volumeHoraire=" + volumeHoraire + "H" + "]";
    }

    public static void main(String[] args) {
        Module module = new Module();
        module.setId(1);
        module.setNom("Java");
        module.setDescription(
                "Java est un langage de programmation de haut niveau, basé sur des classes et orienté objet, qui est conçu pour avoir le moins de dépendances d'implémentation possible.");
        module.setVolumeHoraire(20);
        module.setCoefficient(4);

        System.out.println(module);
    }
}
