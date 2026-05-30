package taller16.ejercicio1;

public class Main {

    public static void main(String[] args) {
        double precioInicial = 1000.0;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20.0);
        Descuento descuentoFijo = new DescuentoFijo(150.0);

        System.out.println("Precio original: $" + precioInicial);
        System.out.println("Precio con descuento de 20%: $" + descuentoPorcentaje.aplicarDescuento(precioInicial));
        System.out.println("Precio con descuento fijo de $150: $" + descuentoFijo.aplicarDescuento(precioInicial));
    }
}
