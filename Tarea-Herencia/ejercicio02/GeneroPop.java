package Herencia.ejercicio02;

class GeneroPop extends GeneroMusical {
    private boolean tieneBaile;

    public GeneroPop(String nombre, String descripcion, boolean tieneBaile) {
        super(nombre, descripcion);
        this.tieneBaile = tieneBaile;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo una canción de " + getNombre() + "...");
        if (tieneBaile) {
            System.out.println("¡Prepárate para moverte al ritmo del pop!");
        } else {
            System.out.println("Disfruta de la melodía pegajosa del pop.");
        }
    }
}
