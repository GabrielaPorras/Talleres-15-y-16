package taller16.ejercicio2;

public abstract class Documento {

    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void exportar();

}
