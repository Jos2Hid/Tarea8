package Herencia.ejercicio01;

abstract class Campeon {
    private String nombre;
    private String rol;
    private String precio;


    public Campeon(String nombre, String rol, String precio) {
        this.nombre = nombre;
        this.rol = rol;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
    public String getPrecio(){
        return precio;

    }

    // Otros métodos comunes a todos los campeones
    public void autoAtaque() {
        System.out.println( nombre + ", da un auto Ataque");
    }

    public void mostrarRol() {
        System.out.println("Mi rol principal es: " + rol);
    }
    public void mostrarNombre(){
        System.out.println("Mi nombre es: "+ nombre);
    }

    public abstract void comboAtaque();
}
