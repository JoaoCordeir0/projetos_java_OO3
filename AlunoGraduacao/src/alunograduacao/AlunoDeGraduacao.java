/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alunograduacao;

/**
 *
 * @author joaoc
 */
public class AlunoDeGraduacao extends Faculdade {
    private int anoCurso;
    
    public AlunoDeGraduacao(String nome, String ra, String nomeCurso, int anoCurso){
        super(nome, ra, nomeCurso);
        this.anoCurso = anoCurso;
    }
   
    public int getAnoCurso(){
        return anoCurso;
    }
        
}
