// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP3;

public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();
        Vehicule moto = new Moto();

        System.out.println("Test de la voiture :");
        voiture.demarrer();
        voiture.arreter();
        System.out.println("La vitesse max est : " +voiture.getVitesseMax()+ "Km/h" + "\n");

        System.out.println("Test du vélo :");
        velo.demarrer();
        velo.arreter();
        System.out.println("La vitesse max est : " +velo.getVitesseMax()+ "Km/h" + "\n");

        System.out.println("Test de la moto :");
        moto.demarrer();
        moto.arreter();
        System.out.println("La vitesse max est : " +moto.getVitesseMax()+ "Km/h" + "\n");
    }
    
}
