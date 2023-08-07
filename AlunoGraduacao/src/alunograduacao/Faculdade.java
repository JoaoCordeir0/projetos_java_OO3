/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alunograduacao;

/**
 *
 * @author joaoc
 */
public class Faculdade {
    private String nome;
    private String ra;
    private String nomeCurso;
  
    public Faculdade(String nome, String ra, String nomeCurso){
        this.nome = nome;
        this.ra = ra;
        this.nomeCurso = nomeCurso;        
    }
   
    public String getNome(){
        return nome;
    }
    public String getRa(){
        return ra;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }
}