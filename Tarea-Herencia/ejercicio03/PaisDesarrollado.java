package Herencia.ejercicio03;

class PaisDesarrollado extends Pais {
    private String nivelDesarrollo;

    public PaisDesarrollado(String nombre, String idioma, String nivelDeEconomia, String nivelDesarrollo) {
        super(nombre, idioma, nivelDeEconomia);
        this.nivelDesarrollo = nivelDesarrollo;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Información del país desarrollado: " + getNombre());
        System.out.println("idioma: " + getIdioma());
        System.out.println("Nivel de economia: "+ getNivelDeEconomia());
        System.out.println("Nivel de economia: " + nivelDesarrollo);
    }
}
