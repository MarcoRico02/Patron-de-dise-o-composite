package Ejemplo_1;

public class MenuItem implements MenuDisplay {
    private String nombre;

    public MenuItem(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("comida: " + nombre);
    }
}
