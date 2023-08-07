/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunoassociacao;

/**
 *
 * @author joaoc
 */
public class Aluno {
    private String nome;
    private int ra;
    private char sexo;
    private Endereco endereco;
    
    public Aluno(String nome, int ra, char sexo, Endereco endereco) {
        this.nome = nome;
        this.ra = ra;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", sexo=" + sexo + ", endereco=" + endereco + '}';
    }

    
    
}
