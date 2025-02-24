// KAMBALE MULIWAVYO Michel 20483 GEI 2024-2025
package TP.TP1;

public class TestInstitution {
    public static void main(String[] args) {
        Institution inst1 = new Institution("Polytechnique", "RDC",
                 "Publique", 1955);
        Institution inst2 = new Institution("Santé publique", "RDC", 
                 "Privée", 1960);
        inst1.decrire();
        inst2.decrire();
        System.out.println("\n");

        Universite univ1 = new Universite("ULPGL GOMA", "RDC", 
                 "Publique", 1991, 7, "LMD",
                  "Dr. WASSO MISONA");
        Universite univ2 = new Universite("ISTA GOMA", "RDC", 
                 "Publique", 1993, 5, "LMD", 
                 "Dr. KAMBALE MONDO Augustin");
        univ1.decrire();
        univ2.decrire();
        System.out.println("\n");

        Ecole ecole1 = new Ecole("INSTITUT HIMBI", "RDC", 
                 "Publique", 1993, 27, "Secondaire", 
                 "KAKULE KASEREKA WAKATA");
        Ecole ecole2 = new Ecole("ITIG GOMA", "RDC", 
                 "Publique", 1955, 32, "Secondaire", 
                 "PERE NAZAIRE MULOKO");
        Ecole ecole3 = new Ecole("EP. ASIFIWE", "RDC", 
                 "Publique", 1991, 15, "Primaire", 
                 "KAMBALE MIHINDO ESAI");
        ecole1.decrire();
        ecole2.decrire();
        ecole3.decrire();
        System.out.println("\n");

    }
}
