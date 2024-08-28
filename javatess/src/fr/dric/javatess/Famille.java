package fr.dric.javatess;

import java.util.ArrayList;
import java.util.List;

public class Famille {
    private Personne pere;
    private Personne mere;
    private List<Personne> enfants;

    public Famille(Personne pere, Personne mere) {
        this.pere = pere;
        this.mere = mere;
        this.enfants = new ArrayList<>();
    }

    // Getters et setters
    public Personne getPere() {
        return pere;
    }

    public void setPere(Personne pere) {
        this.pere = pere;
    }

    public Personne getMere() {
        return mere;
    }

    public void setMere(Personne mere) {
        this.mere = mere;
    }

    public List<Personne> getEnfants() {
        return enfants;
    }

    public void addEnfant(Personne enfant) {
        enfants.add(enfant);
        // Associe l'enfant à cette famille
        enfant.setFamille(this);
    }

    public void seMarier(Personne pere, Personne mere) {
        this.pere = pere;
        this.mere = mere;
        pere.setFamille(this);
        mere.setFamille(this);
    }

    public void afficherAscendants(Personne personne) {
        System.out.println("Ascendants de " + personne.getPrenom() + " " + personne.getNom() + ":");
        if (this.pere != null) {
            System.out.println("Père: " + this.pere.getPrenom() + " " + this.pere.getNom());
            // Appel récursif pour les grands-parents (ici simplifié)
        }
        if (this.mere != null) {
            System.out.println("Mère: " + this.mere.getPrenom() + " " + this.mere.getNom());
            // Appel récursif pour les grands-parents (ici simplifié)
        }
    }

    public void afficherDescendants(Personne personne) {
        System.out.println("Descendants de " + personne.getPrenom() + " " + personne.getNom() + ":");
        if (this.enfants != null) {
            for (Personne enfant : enfants) {
                System.out.println("Enfant: " + enfant.getPrenom() + " " + enfant.getNom());
                // Appel récursif pour les petits-enfants (ici simplifié)
            }
        }
    }
}
