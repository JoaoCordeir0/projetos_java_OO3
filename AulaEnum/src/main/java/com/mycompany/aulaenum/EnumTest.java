package com.mycompany.aulaenum;

/**
 *
 * @author joaoc
 */
public class EnumTest {

    Dia dia;

    public EnumTest(Dia dia) {
        this.dia = dia;
    }

    public void info() {
        switch (dia) {
            case SEGUNDA_FEIRA -> System.out.println("Iniciando a semana para trabalhar.");
            case SEXTA_FEIRA -> System.out.println("Sextoooou!");
            case SABADO, DOMINGO -> System.out.println("Ufa, Final de semana !");
            default -> System.out.println("Dias normais!");
        }
    }
}