/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planocartesiano;

/**
 *
 * @author joaoc
 */
public class Coordenadas {
    private static int pontos = 0;
    private int x;
    private int y;
    public Coordenadas(int eixoX, int eixoY){
        pontos++;
        this.x = eixoX;
        this.y = eixoY;
    }
    
    public void Quadrante(int x, int y){
        if(x > 0 && y > 0){
            System.out.println("Quadrande 1");
        }
        if(x < 0 && y > 0){ 
            System.out.println("Quadrande 2");
        }
        if(x < 0 && y < 0){
            System.out.println("Quadrande 3");
        }
        if(x > 0 && y < 0){
            System.out.println("Quadrande 4");
        }       
    }
    public static int getPontos(){
        return Coordenadas.pontos;
    }
}
