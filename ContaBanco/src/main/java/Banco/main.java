/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author Cordeiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario func1 = new Funcionario();     
                        
        System.out.println("Nome do Funcionario = ["+func1.nome+"]\nCargo = ["+func1.cargo+"]\nSalario = ["+func1.salario+"]");
        func1.calcularSalario(300);
    }
    
}
