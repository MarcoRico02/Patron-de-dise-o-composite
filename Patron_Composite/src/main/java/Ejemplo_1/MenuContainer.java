package Ejemplo_1;

import java.util.ArrayList;
import java.util.List;

public class MenuContainer implements MenuDisplay {

    private String nombre;
    private List<MenuDisplay> contenido = new ArrayList<>();

    public MenuContainer(String nombre) {
        this.nombre = nombre;
    }

    public void añadirMenu(MenuDisplay item) {
        contenido.add(item);
    }

    public void eliminarMenu(MenuDisplay item) {
        contenido.remove(item);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menu " + nombre + ": ");
        System.out.println("--------------------");
        for (MenuDisplay menuDisplay : contenido) {
            menuDisplay.mostrarMenu();
        }
    }
}
