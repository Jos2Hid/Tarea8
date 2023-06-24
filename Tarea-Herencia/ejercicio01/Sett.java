package Herencia.ejercicio01;

public class Sett extends Campeon{
    private String resistencia;
    private String raza;

    public Sett(String nombre, String rol, String precio, String resistencia, String raza) {
        super(nombre, rol, precio);
        this.resistencia = resistencia;
        this.raza = raza;
    }
    @Override
    public void comboAtaque(){
        System.out.println("Su combo rapido de " + getNombre()+ " es E+AA+AA+Q+AA+AA+R+AA+AA+W");
    }
}
