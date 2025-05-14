package Ejemplo_1;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.awt.*;

public class Main2Swing {
    public static void main(String[] args) {
        /*
        ACLARACION, ESTO NO USA EL PATRON
        SOLO QUE EN LA TERMINAL NO SE TERMINA DE APRECIAR LA JERARQUIA
        Y QUERIA MOSTRAR EL ARBOL EN ALGO MAS ILUSTRATIVO
        */

        //Crear las secciones del menú
        DefaultMutableTreeNode menuCompleto = new DefaultMutableTreeNode("Menú Completo");

        // Sección Mexicana
        DefaultMutableTreeNode mexicana = new DefaultMutableTreeNode("Comida Mexicana");
        mexicana.add(new DefaultMutableTreeNode("Tacos"));
        mexicana.add(new DefaultMutableTreeNode("Burritos"));
        menuCompleto.add(mexicana);

        // Sección China
        DefaultMutableTreeNode china = new DefaultMutableTreeNode("Comida China");
        china.add(new DefaultMutableTreeNode("Ramen"));
        china.add(new DefaultMutableTreeNode("Rollos Primavera"));
        menuCompleto.add(china);

        // Sección Bebidas dividida en dos contenedores
        DefaultMutableTreeNode bebidas = new DefaultMutableTreeNode("Bebidas");

        // Bebidas Frías
        DefaultMutableTreeNode bebidasFrias = new DefaultMutableTreeNode("Bebidas Frías");
        bebidasFrias.add(new DefaultMutableTreeNode("Agua Fresca"));
        bebidasFrias.add(new DefaultMutableTreeNode("Jugo Natural"));
        bebidas.add(bebidasFrias);

        // Bebidas Embotelladas
        DefaultMutableTreeNode bebidasEmbotelladas = new DefaultMutableTreeNode("Bebidas Embotelladas");
        bebidasEmbotelladas.add(new DefaultMutableTreeNode("Refresco"));
        bebidasEmbotelladas.add(new DefaultMutableTreeNode("Cerveza"));
        bebidas.add(bebidasEmbotelladas);

        menuCompleto.add(bebidas);

        // Crear el JTree a partir de la estructura del árbol
        JTree tree = new JTree(menuCompleto);
        tree.setRootVisible(true); // Ocultar la raíz para mayor claridad

        // Crear un JScrollPane para hacer el árbol desplazable
        JScrollPane scrollPane = new JScrollPane(tree);
        tree.setFont(new Font("Arial", Font.PLAIN, 16));

        // Crear la ventana
        JFrame frame = new JFrame("Menú Completo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        // Agregar el JScrollPane con el árbol al contenedor de la ventana
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
