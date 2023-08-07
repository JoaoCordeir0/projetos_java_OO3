/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author joaoc
 */
public class Funcionario {
    private int numRegistro;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(int numRegistro, String nome, String cargo, double salario) {
        this.numRegistro = numRegistro;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
}
