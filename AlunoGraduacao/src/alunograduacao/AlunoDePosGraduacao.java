/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alunograduacao;

/**
 *
 * @author joaoc
 */
public class AlunoDePosGraduacao extends Faculdade{
    private String Pesquisa;
    
    public AlunoDePosGraduacao(String nome, String ra, String nomeCurso, String Pesquisa){
        super(nome, ra, nomeCurso);
        this.Pesquisa = Pesquisa;
    }
    
    public String getPesquisa(){
        return Pesquisa;
    }
}
