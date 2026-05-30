package taller16.ejercicio1;

public class DescuentoFijo extends Descuento {

    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - montoFijo;
    }
}
