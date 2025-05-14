package Ejemplo_2;

public class Producto implements Item {
    private double precio;
    private String nombre;

    public Producto(String nombre,double precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public double getPrice() {
        return precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
