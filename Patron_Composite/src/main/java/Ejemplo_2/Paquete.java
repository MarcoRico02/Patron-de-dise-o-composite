package Ejemplo_2;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Item{
    private String nombre;
    private List<Item> items = new ArrayList<>();

    public Paquete(String nombre) {
        this.nombre = nombre;
    }

    public void añadir(Item item) {
        items.add(item);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public double getPrice() {
        double precioTotal = 0;
        for (Item item : items) {
            precioTotal += item.getPrice();
        }
        return precioTotal;
    }

}
