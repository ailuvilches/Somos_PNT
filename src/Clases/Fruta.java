package Clases;

public class Fruta extends Producto{

    private String unidad;
    public Fruta(String nombre, Double precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    @Override
    public String toString() {

        return "Nombre: " + this.nombre +
                " /// Precio: $" + Math.round(this.precio) +
                " /// Unidad de venta: " + this.unidad;

    }
}
