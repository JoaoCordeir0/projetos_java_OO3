/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author joaoc
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String profissao;

    public Pessoa(int codigo, String nome, String profissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.profissao = profissao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", profissao=" + profissao + '}';
    }
 
}
