package fr.dric.javatess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création de personnes
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Personne alice = new Personne("Dupont", "Alice", sdf.parse("1980-05-15"));
            Personne bob = new Personne("Martin", "Bob", sdf.parse("1978-08-22"));
            Personne charlie = new Personne("Durand", "Charlie", sdf.parse("2005-12-30"));

            // Création de la famille
            Famille famille = new Famille(bob, alice);

            // Se marier
            famille.seMarier(bob, alice);

            // Ajouter un enfant
            famille.addEnfant(charlie);

            // Afficher les ascendants et descendants
            famille.afficherAscendants(alice);
            famille.afficherDescendants(alice);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}