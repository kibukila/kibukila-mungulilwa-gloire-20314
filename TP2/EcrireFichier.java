
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EcrireFichier {
    public static void main(String[] args) {
        File file = new File("Michel.txt");

        if (!(file.exists())) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } 
        }else{
            try {
                FileWriter ecrirer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(ecrirer);

                bw.write("Bonjour Michel");
                bw.newLine();
                bw.write("Voici le texte à ecrire et à lire ....");
                bw.newLine();
                bw.write("C'est le tp pour écrire dans un fichier ");
                bw.newLine();
                bw.write("Avec BufferdWriter et FileWriter");
                bw.newLine();
                bw.write("Mais aussi pour lire avec BufferedReader");
                bw.newLine();
                bw.write("Passe une excellente journée");

                bw.close();
                ecrirer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
           
        }
    }
}
