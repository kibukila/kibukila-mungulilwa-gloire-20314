// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP1;

public class Universite extends Institution {
    private int nombreFacultes;
    private String systemeEnseignement;
    private String nomRecteur;

    public Universite (String nomInstitution, String paysInstitution, String typeInstitution, 
            int anneeCreation,int nombreFacultes, String systemeEnseignement, String nomRecteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFacultes = nombreFacultes;
        this.systemeEnseignement = systemeEnseignement;
        this.nomRecteur = nomRecteur;
    }
    public int getNombreFacultes(){
        return nombreFacultes;
    }
    public void setNombreFacultes(int nombreFacultes){
        this.nombreFacultes = nombreFacultes;
    }
    public String getSystemeEnseignement(){
        return systemeEnseignement;
    }
    public void setSystemeEnseignement(String systemeEnseignement){
        this.systemeEnseignement = systemeEnseignement;
    }
    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomRecteur(String nomRecteur){
        this.nomRecteur = nomRecteur;
    }
    public static String donnerNomsRecteurs(Universite univ1, Universite univ2){
        return "Recteur 1: " +univ1.getNomRecteur()+ " Recteur 2: " +univ2.getNomRecteur();
    }
    public void decrire(){
        super.decrire();
        System.out.println("Nombre des facultés : " +this.nombreFacultes+ 
                " , Systeme d'enseignement : " +this.systemeEnseignement+ 
                " , Recteur : " +this.nomRecteur);
    }
   
}
