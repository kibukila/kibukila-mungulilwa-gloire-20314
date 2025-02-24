// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP1;

public class Institution {
    private String nomInstitution;
    private String paysInstitution;
    private String typeInstitution;
    private int anneeCreation;

    public Institution(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation){
        this.nomInstitution = nomInstitution;
        this.paysInstitution = paysInstitution;
        this.typeInstitution = typeInstitution;
        this.anneeCreation = anneeCreation;
    }
    public String getNomInstitution(){
        return nomInstitution;
    }
    public void setNomInstitution(String nomInstitution){
        this.nomInstitution = nomInstitution;
    }
    public String getPaysInstruction(){
        return paysInstitution;
    }
    public void setPaysInsitution(String paysInstitution){
        this.paysInstitution = paysInstitution;
    }
    public String getTypeInstitution(){
        return typeInstitution;
    }
    public void setTypeInstitution(String typeInstitution){
        this.typeInstitution = typeInstitution;
    }
    public int getAnneeCreation(){
        return anneeCreation;
    }
    public void setAnneeCreation(int anneeCreation){
        this.anneeCreation = anneeCreation;
    }
    public int getAge(int anneeActuelle){
        return anneeActuelle - this.anneeCreation;
    }
    public void decrire(){
        System.out.println("Institution: " +this.nomInstitution+" , Pays: " +this.paysInstitution+ 
                 " , Type: " +this.typeInstitution+ ", Année de création: " +this.anneeCreation+ 
                 " , Age: " +getAge(2025)+ "ans");
    }
}
