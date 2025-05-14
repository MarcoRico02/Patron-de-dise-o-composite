package Ejemplo_2;

public class Main3 {
    public static void main(String[] args) {
        // Productos
        Producto celular = new Producto("Celular", 300.00);
        Producto laptop = new Producto("Laptop", 900.00);
        Producto escritorio = new Producto("Escritorio", 150.00);
        Producto silla = new Producto("Silla", 85.00);
        Producto papas = new Producto("Papas", 1.50);
        Producto galletas = new Producto("Galletas", 2.00);
        Producto jugo = new Producto("Jugo", 1.20);
        Producto agua = new Producto("Agua", 0.80);

        // Paquetes
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

        // Mostrar catálogo y precio total
        System.out.printf("\nPrecio total del catálogo: $%.2f%n", catalogo.getPrice());
    }
}
