package Clases;

public class Bebida extends Producto{

    private Double litros;
    public Bebida(String nombre, Double precio, Double contenido) {
        super(nombre, precio);
        this.litros = contenido;
    }

    @Override
    public String toString() {

        return "Nombre: " + this.nombre +
                " /// Litros: " + this.litros +
                " /// Precio: $" + Math.round(this.precio);

    }

}
