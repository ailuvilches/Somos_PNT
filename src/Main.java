import Clases.*;

public class Main {
    public static void main(String[] args) {

        //Instanciar Supermercado
        Supermercado supermercado = new Supermercado("Supermercado");

        //Instanciar Productos
        Producto cocaColaZero = new Bebida("Coca-Cola Zero", 20.0, 1.5);
        Producto cocaCola = new Bebida("Coca-Cola", 18.0, 1.5);
        Producto shampoo = new Perfumería("Shampoo Sedal", 19.0, 500.0);
        Producto fruta = new Fruta("Frutillas", 64.0, "kilo");

        //Agregar productos al stock
        supermercado.añadirProducto(cocaColaZero);
        supermercado.añadirProducto(cocaCola);
        supermercado.añadirProducto(shampoo);
        supermercado.añadirProducto(fruta);


        //Imprimir por Consola
        System.out.println(supermercado);

    }
}