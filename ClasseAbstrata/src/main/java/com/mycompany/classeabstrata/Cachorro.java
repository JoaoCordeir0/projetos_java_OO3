/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author joaoc
 */
public class Cachorro extends Animal{
   
    public void enterraOsso()
    {
        System.out.println("Enterra osso");
    }
    
    @Override 
    public void fazerBarulho()
    {
        System.out.println("Au au!");
    }
}
