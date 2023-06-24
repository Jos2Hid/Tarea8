package Herencia.ejercicio01;

public class Jinx extends Campeon{
    private String velocidadAtaque;
    private String raza;

    public Jinx(String nombre, String rol, String precio, String velocidadAtaque, String raza) {
        super(nombre, rol, precio);
        this.velocidadAtaque = velocidadAtaque;
        this.raza = raza;
    }
    @Override
    public void comboAtaque(){
        System.out.println("Su combo rapido de" + getNombre()+ " es E+AA+W+R+AA+AA");
    }

}
