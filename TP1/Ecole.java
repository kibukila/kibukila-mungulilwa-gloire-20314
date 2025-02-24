// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP1;

public class Ecole extends Institution {
    private  String typeEcole;
    private int nombreClasses;
    private String nomPromoteur;

    public Ecole (String nomInstitution, String paysInstitution, String typeInstitution, 
    int anneeCreation, int nombreClasses, String typeEcole, String nomPromoteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.typeEcole = typeEcole;
        this.nombreClasses = nombreClasses;
        this.nomPromoteur = nomPromoteur;
    }
    public String getTypeEcole(){
        return typeEcole;
    }
    public void setTypeEcole(String typeEcole){
        this.typeEcole = typeEcole;
    }
    public String getNomPromoteur(){
        return nomPromoteur;
    }
    public void setNomPromoteur(String nomPromoteur){
        this.nomPromoteur = nomPromoteur;
    }
    public int getNombreClasses(){
        return nombreClasses;
    }
    public void setNombreClasses(int nombreClasses){
        this.nombreClasses = nombreClasses;
    }
    public static String donnerNomsPromoteur(Ecole ecole1, Ecole ecole2,Ecole ecole3){
        return "Promoteur 1: "+ecole1.getNomPromoteur()+ "Promoteur 2: "+ecole2.getNomPromoteur()+ 
                "Promoteur 3: "+ecole3.getNomPromoteur();
    }
    public void decrire(){
        super.decrire();
        System.out.println("Type d'ecole : " +this.typeEcole+ 
                " , Nombre des classes : " +this.nombreClasses+ 
                " , Promoteur : " +this.nomPromoteur);
    }
}

