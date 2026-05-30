package taller16.ejercicio1;

public class DescuentoPorcentaje extends Descuento {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * (porcentaje / 100));
    }
}
