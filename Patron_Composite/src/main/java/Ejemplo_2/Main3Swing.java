package Ejemplo_2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Main3Swing {
    public static void main(String[] args) {
        // Crear catálogo
        Paquete catalogo = construirCatalogo();

        // Crear nodo raíz desde el catálogo
        DefaultMutableTreeNode rootNode = crearNodo(catalogo);

        // Crear árbol Swing
        JTree arbol = new JTree(rootNode);
        arbol.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(arbol);

        // Crear ventana
        JFrame frame = new JFrame("Catálogo de Paquetes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Construye el catálogo completo
    private static Paquete construirCatalogo() {
        Producto celular = new Producto("Celular", 300.00);
        Producto laptop = new Producto("Laptop", 900.00);
        Producto escritorio = new Producto("Escritorio", 150.00);
        Producto silla = new Producto("Silla", 85.00);
        Producto papas = new Producto("Papas", 1.50);
        Producto galletas = new Producto("Galletas", 2.00);
        Producto jugo = new Producto("Jugo", 1.20);
        Producto agua = new Producto("Agua", 0.80);

        Paquete electronica = new Paquete("Electrónica");
        electronica.añadir(celular);
        electronica.añadir(laptop);

        Paquete oficina = new Paquete("Oficina");
        oficina.añadir(escritorio);
        oficina.añadir(silla);

        Paquete snacks = new Paquete("Paquete Snacks");
        snacks.añadir(papas);
        snacks.añadir(galletas);

        Paquete bebidas = new Paquete("Paquete Bebidas");
        bebidas.añadir(jugo);
        bebidas.añadir(agua);

        Paquete alimentos = new Paquete("Alimentos");
        alimentos.añadir(snacks);
        alimentos.añadir(bebidas);

        Paquete catalogo = new Paquete("Catálogo de Paquetes");
        catalogo.añadir(electronica);
        catalogo.añadir(oficina);
        catalogo.añadir(alimentos);

        return catalogo;
    }

    // Crea recursivamente el nodo visual de un Item (Producto o Paquete)
    private static DefaultMutableTreeNode crearNodo(Item item) {
        if (item instanceof Producto p) {
            return new DefaultMutableTreeNode(p.getNombre() + " - $" + String.format("%.2f", p.getPrice()));
        } else if (item instanceof Paquete paquete) {
            String titulo = paquete.getNombre() + " (Total: $" + String.format("%.2f", paquete.getPrice()) + ")";
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(titulo);
            for (Item subItem : paquete.getItems()) {
                nodo.add(crearNodo(subItem));
            }
            return nodo;
        }
        return new DefaultMutableTreeNode("Item desconocido");
    }
}
