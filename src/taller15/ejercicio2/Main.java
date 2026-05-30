package taller15.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Producto miProducto = new Producto("Telefono Movil", 1000.0);

        GeneradorEtiqueta generador = new GeneradorEtiqueta();
        CalculadoraPrecio calculadora = new CalculadoraPrecio();

        generador.imprimirEtiqueta(miProducto);

        double precioFinal = calculadora.calcularPrecioConImpuesto(miProducto);
        System.out.println("Precio final con impuesto: $" + precioFinal);
    }
}
