package Herencia.ejercicio03;

class PaisEnDesarrollo extends Pais {
    private String areaEconomica;

    public PaisEnDesarrollo(String nombre, String idioma, String nivelDeEconomia, String areaEconomica) {
        super(nombre, idioma, nivelDeEconomia);
        this.areaEconomica = areaEconomica;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Información del país en desarrollo: " + getNombre());
        System.out.println("Idioma: " + getIdioma());
        System.out.println("Nivel de Economia:  " + getNivelDeEconomia());
        System.out.println("Área económica: " + areaEconomica);
    }
}

