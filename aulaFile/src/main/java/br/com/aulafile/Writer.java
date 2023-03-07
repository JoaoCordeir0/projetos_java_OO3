package br.com.aulafile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cordeiro
 */
public class Writer {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("log.txt", true);
            PrintWriter write = new PrintWriter(file);
            write.println("Erro 1");
            write.println("Erro 2");
            write.println("Erro 3");
            write.println("Erro 4");
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
