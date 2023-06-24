package Herencia.ejercicio02;

abstract class GeneroMusical {
    private String nombre;
    private String descripcion;

    public GeneroMusical(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método abstracto que debe ser implementado en las clases derivadas
    public abstract void reproducir();

    // Otros métodos comunes a todos los géneros musicales
    public void imprimirInformacion() {
        System.out.println("Nombre del género musical: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}

