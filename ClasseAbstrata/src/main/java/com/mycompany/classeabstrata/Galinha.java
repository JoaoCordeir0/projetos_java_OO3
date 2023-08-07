/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author joaoc
 */
public class Galinha extends Animal{
    
    public void botar()
    {
        System.out.println("Bota ovo");
    }
    
    @Override 
    public void fazerBarulho()
    {
        System.out.println("Có có!");
    }
    
}
