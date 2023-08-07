/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cordeiro
 */
public class Aluno {
    private String ra;
    private String nome;
    private double n1;
    private double n2;
    private double media;
    
    //Construtor
    public Aluno(String r_a, String nomeAluno){
        this.ra = r_a;
        this.nome = nomeAluno;
    }
    
    //Sets do codigo
    public void setRa(String r_a){
        ra = r_a;
    }
    public void setNome(String nome_aluno){
        nome = nome_aluno;
    }
    public void setNota1(double nota1){
        n1 = nota1;
    }
    public void setNota2(double nota2){
        n2 = nota2;
    }
    
    //Gets do codigo
    public String getRa(){
        return ra;
    }
    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return n1;
    }
    public double getNota2(){
        return n2;
    }
    public double getMedia(){
        return media;
    }
    
    //Metodos 
    public double CalculaMedia(){
        media = (n1 + n2)/2;
        return media;
    }
    public String SituacaoAluno(){
        if(media > 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
