/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.planocartesiano;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class PlanoCartesiano {

    public static void main(String[] args) {
        System.out.println("PLANO CARTESIANO");
        String op;
        do{
        Scanner ler = new Scanner(System.in);
        
        System.out.println("[S] Para marcar outro ponto");
        System.out.println("[N] Para sair");
           op = ler.next();
        
            System.out.println("Digite o valor do eixo X ->");
                int x = ler.nextInt();
            System.out.println("Digite o valor do eixo Y ->");
                int y = ler.nextInt();
            Coordenadas plano = new Coordenadas(x, y);
            plano.Quadrante(x, y);
            
        }while(op.equals("s"));
        System.out.println("Numero de pontos ->" + Coordenadas.getPontos());
    }
}
