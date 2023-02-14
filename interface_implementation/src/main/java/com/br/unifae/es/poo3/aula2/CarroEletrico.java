package com.br.unifae.es.poo3.aula2;

/**
 *
 * @author android
 */

import javax.swing.JOptionPane;

public class CarroEletrico extends VeiculoTerrestre{

    @Override
    public String abastecimento() {
        JOptionPane.showMessageDialog(null, "Eletricidade");
        
        return "Abastecimento feito";
    }

    @Override
    public String transportar(Object carga, String origem, String destino) {
        JOptionPane.showMessageDialog(null, carga + " da origem " + origem + " para o destino");
        
        return "Transporte feito";
    }            
}
