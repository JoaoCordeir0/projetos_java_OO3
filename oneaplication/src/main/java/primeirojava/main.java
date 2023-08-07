/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeirojava;

import java.util.Scanner;

/**
 *
 * @author Cordeiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
       System.out.println("Ola mundo");
       System.out.println("Digite um numero para fazer a tabuada: ");
       
       int n,i;
       
       Scanner ler = new Scanner(System.in);
       n = ler.nextInt();
       
       System.out.println();
       
       for(i=1; i<=10; i++){
           System.out.printf("%d x %d = %d\n", n, i, (n*i));
       }
    }
    
}
