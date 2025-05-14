package Ejemplo_1;

public class Main {
    public static void main(String[] args) {
        // Objeto
        MenuDisplay item1 = new MenuItem("Tacos");
        MenuDisplay item2 = new MenuItem("Burritos");
        MenuDisplay item3 = new MenuItem("Quesadillas");

        // Contenedores
        MenuContainer mexicanMenu = new MenuContainer("Comida Mexicana");
        mexicanMenu.añadirMenu(item1);
        mexicanMenu.añadirMenu(item2);
        mexicanMenu.añadirMenu(item3);

        // Mostrar
        mexicanMenu.mostrarMenu();
    }
}
