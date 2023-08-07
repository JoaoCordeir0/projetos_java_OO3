/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Cordeiro
 */
public class Funcionario {
    
    String nome;
    String cargo;
    Double salario;
    
    public void calcularSalario(double horasExtra){
          double salarioT;
          salarioT = salario+horasExtra;
          System.out.println("Salario do mês: " + salarioT);
    }
}
