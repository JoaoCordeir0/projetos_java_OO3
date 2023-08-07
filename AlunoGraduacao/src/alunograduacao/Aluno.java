/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alunograduacao;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        String nome, ra, nomeCurso, pesquisa = null;
        int anoCurso = 0, op;
        
        System.out.println("Aluno de Graduação{1} de Pos Graduação{2}");
            op = ler.nextInt();

        if(op == 1){
            System.out.println("Digite o nome do aluno -> ");
            nome = ler.next();
            System.out.println("Digite o ra -> ");
                ra = ler.next();
            System.out.println("Digite o nome do curso");
            nomeCurso = ler.next();
            System.out.println("Digite o ano do curso -> ");
                anoCurso = ler.nextInt();
            AlunoDeGraduacao gra = new AlunoDeGraduacao(nome, ra, nomeCurso, anoCurso);      
            
            System.out.println("Aluno de Graduação");
            System.out.println("Nome -> "+ gra.getNome() + "Ra -> " + gra.getRa() + "Nome Curso -> " + gra.getNomeCurso() + "Ano Curso ->" + gra.getAnoCurso());
            
            
        } else if(op == 2){
            System.out.println("Digite o nome do aluno -> ");
                nome = ler.next();
            System.out.println("Digite o ra -> ");
                ra = ler.next();
            System.out.println("Digite o nome do curso");
                nomeCurso = ler.next();
            System.out.println("Digite a pesquisa -> ");
                pesquisa = ler.next();
            AlunoDePosGraduacao pos = new AlunoDePosGraduacao(nome, ra, nomeCurso, pesquisa);      
        
            System.out.println("Aluno de Pos Graduação");
            System.out.println("Nome -> "+ pos.getNome() + "Ra -> " + pos.getRa() + "Nome Curso -> " + pos.getNomeCurso() + "Ano Curso ->" + pos.getPesquisa());
            
        }         
    }
    
}
