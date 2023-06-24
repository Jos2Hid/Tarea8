package Herencia.ejercicio03;

abstract class Pais {
    private String nombre;
    private String idioma;
    private String nivelDeEconomia;

    public Pais(String nombre, String idioma, String nivelDeEconomia) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.nivelDeEconomia = nivelDeEconomia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }
    public String getNivelDeEconomia(){
        return nivelDeEconomia;
    }

    // Método abstracto que debe ser implementado en las clases derivadas
    public abstract void obtenerInformacion();

    // Otros métodos comunes a todos los países
    public void mostrarNombre() {
        System.out.println("Nombre del país: " + nombre);
    }

    public void mostrarIdioma() {
        System.out.println("Idioma del pais: " + idioma);
    }
    public void mostrarNivelDeEconomia(){
        System.out.println("Nivel de economia del pais: "+ nivelDeEconomia);
    }
}

