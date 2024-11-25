package creacionales.factorymethod;

public class Main {
    public static void main(String[] args) {
        FabricaProducto fabrica = new FabricaA();
        Producto producto= fabrica.crearProducto();
        producto.usar();

        fabrica = new FabricaB();
        producto = fabrica.crearProducto();
        producto.usar();
    }
}
