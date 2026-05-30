package taller15.ejercicio2;

public class CalculadoraPrecio {

    public double calcularPrecioConImpuesto(Producto producto) {
        double impuesto = producto.getPrecioBase() * 0.19;
        return producto.getPrecioBase() + impuesto;
    }
}
