/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tratamentoexcecao;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class TratamentoExcecao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Numerador > ");
        int numerador = scan.nextInt();
        System.out.println("Denominador > ");
        int denominador = scan.nextInt();
         
        int resultado = divisao(numerador, denominador);
        System.out.println("Resultado > " + resultado);
    }
    
    public static int divisao(int numerador, int denominador)
    {
        try
        {
            return numerador / denominador;
        }
        catch(Exception z)
        {
            System.out.println("Erro -> " + z);
            return 0;
        }
    }
}

