/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cris
 */
public class ClienteFisico extends Cliente{
    private String rg;
    private String cpf;
    private Sexo sexo;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public ClienteFisico(String rg, String cpf, Sexo sexo, String nome) {
        super(nome);
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    
    @Override
    public String toString() {
        return "ClienteFisico{" + "rg=" + rg + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }
        
    
}
