// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP3;

public class Moto implements Vehicule {
    public void demarrer(){
        System.out.println("La moto demarre. ");
    }
    public void arreter(){
        System.out.println("La moto s'arrete. ");
    }
    public int getVitesseMax(){
        return 180;
    }
}
