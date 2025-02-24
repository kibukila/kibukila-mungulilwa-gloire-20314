// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP3;

public class Velo implements Vehicule {
    public void demarrer(){
        System.out.println("Le vélo commence à rouler. ");
    }
    public void arreter(){
        System.out.println("Le vélo s'arrete. ");
    }
    public int getVitesseMax(){
        return 30;
    }
}
