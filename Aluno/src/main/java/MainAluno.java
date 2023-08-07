
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cordeiro
 */
public class MainAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno("27099-5", "João Victor Cordeiro");
        
        System.out.println("Digite a 1ª do aluno");
            Scanner ler1 = new Scanner(System.in);
                double nota1 = ler1.nextInt();
        System.out.println("Digite a 2ª do aluno");
            Scanner ler2 = new Scanner(System.in);
                double nota2 = ler2.nextInt();
       
        aluno1.setNota1(nota1);
        aluno1.setNota2(nota2);
        
        System.out.println("Aluno    -> "+ aluno1.getNome());
        System.out.println("Ra       -> "+ aluno1.getRa());
        System.out.println("Nota 1   -> "+ aluno1.getNota1());
        System.out.println("Nota 2   -> "+ aluno1.getNota2());
        System.out.println("Media    -> "+ aluno1.CalculaMedia());
        System.out.println("Situação -> "+ aluno1.SituacaoAluno());
        
    }
    
}
