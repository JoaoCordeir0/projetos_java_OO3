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
public class ClienteJuridico extends Cliente{
    
    private String cnpj;

    public ClienteJuridico(String cnpj, String nome) {
        super( nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "cnpj=" + cnpj + '}';
    }
    
}
