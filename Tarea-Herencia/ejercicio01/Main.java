package Herencia.ejercicio01;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Jinx jinx = new Jinx("Jinx", "ADC","4800", "1.75","Zaunita");
        Sett sett = new Sett("Sett", "Luchador", "3150", "80", "Vastaya");

        sett.mostrarNombre();
        sett.mostrarRol();
        sett.comboAtaque();

        System.out.println(" ");

        jinx.mostrarNombre();
        jinx.mostrarRol();
        jinx.comboAtaque();
    }
}
