package Ejemplo_1;

public class Main2 {
    public static void main(String[] args) {
        // Sección Mexicana
        MenuDisplay taco = new MenuItem("Tacos");
        MenuDisplay burrito = new MenuItem("Burritos");
        MenuContainer mexicana = new MenuContainer("Comida Mexicana");
        mexicana.añadirMenu(taco);
        mexicana.añadirMenu(burrito);

        // Sección China
        MenuDisplay ramen = new MenuItem("Ramen");
        MenuDisplay rollos = new MenuItem("Rollos Primavera");
        MenuContainer china = new MenuContainer("Comida China");
        china.añadirMenu(ramen);
        china.añadirMenu(rollos);

        // Sección Bebidas dividida en dos contenedores
        MenuDisplay agua = new MenuItem("Agua Fresca");
        MenuDisplay soda = new MenuItem("Refresco");
        MenuDisplay jugo = new MenuItem("Jugo Natural");
        MenuDisplay cerveza = new MenuItem("Cerveza");

        // Contenedores hijos de Bebidas
        MenuContainer bebidasFrias = new MenuContainer("Bebidas Frías");
        bebidasFrias.añadirMenu(agua);
        bebidasFrias.añadirMenu(jugo);

        MenuContainer bebidasEmbotelladas = new MenuContainer("Bebidas Embotelladas");
        bebidasEmbotelladas.añadirMenu(soda);
        bebidasEmbotelladas.añadirMenu(cerveza);

        // Contenedor principal de Bebidas
        MenuContainer bebidas = new MenuContainer("Bebidas");
        bebidas.añadirMenu(bebidasFrias);
        bebidas.añadirMenu(bebidasEmbotelladas);

        // Contenedor padre: Menú Completo
        MenuContainer menuCompleto = new MenuContainer("Menú Completo");
        menuCompleto.añadirMenu(mexicana);
        menuCompleto.añadirMenu(china);
        menuCompleto.añadirMenu(bebidas);

        // Mostrar menú completo
        menuCompleto.mostrarMenu();
    }
}
