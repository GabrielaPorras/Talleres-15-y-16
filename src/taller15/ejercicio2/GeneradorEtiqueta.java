package taller15.ejercicio2;

public class GeneradorEtiqueta {

    public void imprimirEtiqueta(Producto producto) {
        System.out.println("--- ETIQUETA DE PRODUCTO ---");
        System.out.println("Articulo: " + producto.getNombre());
        System.out.println("Precio Base: $" + producto.getPrecioBase());
    }
}
