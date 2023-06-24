package Herencia.ejercicio02;

public class Main {
    public static void main(String[] args) {
        GeneroRock rock = new GeneroRock("Rock", "Género musical caracterizado por su energía y ritmo fuerte", 8);
        GeneroPop pop = new GeneroPop("Pop", "Género musical popular y pegajoso", false);

        rock.imprimirInformacion();
        rock.reproducir();
        System.out.println(" ");
        pop.imprimirInformacion();
        pop.reproducir();
    }
}
