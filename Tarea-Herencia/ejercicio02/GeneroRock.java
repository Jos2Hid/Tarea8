package Herencia.ejercicio02;

class GeneroRock extends GeneroMusical {
    private int nivelEnergia;

    public GeneroRock(String nombre, String descripcion, int nivelEnergia) {
        super(nombre, descripcion);
        this.nivelEnergia = nivelEnergia;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo una canción de " + getNombre() + "...");
        System.out.println("¡Rockea al máximo con un nivel de energía de " + nivelEnergia + "!");
    }
}
