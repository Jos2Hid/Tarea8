package Herencia.ejercicio03;

public class Main {
    public static void main(String[] args) {
        PaisDesarrollado paisDesarrollado = new PaisDesarrollado("Estados Unido","Ingles", "Alto","3.5");
        PaisEnDesarrollo paisEnDesarrollo = new PaisEnDesarrollo("Perú","Catellano","Bajo","1.5");

        paisDesarrollado.obtenerInformacion();
        System.out.println(" ");
        paisEnDesarrollo.obtenerInformacion();
    }
}
