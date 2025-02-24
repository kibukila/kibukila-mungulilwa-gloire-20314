// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP3;

public class Voiture implements Vehicule {
    public void demarrer(){
        System.out.println("La voiture demarre. ");
    }
    public void arreter(){
        System.out.println("La voiture s'arrete. ");
    }
    public int getVitesseMax(){
        return 200;
    }
    
}
