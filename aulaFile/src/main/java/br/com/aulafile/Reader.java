package br.com.aulafile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cordeiro
 */
public class Reader {

    public static void main(String[] args) {

        FileReader file = null;
        try {
            file = new FileReader("Alunos.txt");
            Scanner leitor = new Scanner(file);
            // Enquanto houver dados no arquivo
            while (leitor.hasNext()) {
                String dado = leitor.nextLine();

                System.out.println(dado);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Reader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
