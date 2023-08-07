/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tratamentoexcecao2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class TratamentoExcecao2 {

    public static int divisao(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        boolean op = true;
        
        do{
            try
            {
                System.out.println("Numerador -> ");
                int numerador = ler.nextInt();
                System.out.println("Denominador -> ");
                int denominador = ler.nextInt();
                
                int result = divisao(numerador, denominador);
                System.out.println("Resultado -> " + result);
                
                op = false;
            }            
            catch(InputMismatchException inputMismatchException)
            {
                System.out.println("Exceção -> " + inputMismatchException);
                ler.nextLine();
                System.out.println("Você deve digitar inteiros. Por favor, tente novamente");
            }
             catch(ArithmeticException inputMismatchException)
            {
                System.out.println("Exceção -> " + inputMismatchException);            
                System.out.println("Zero é invalido");
            }
        }while(op);
        
    }
}
