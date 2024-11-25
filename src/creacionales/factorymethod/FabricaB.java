package creacionales.factorymethod;

public class FabricaB extends FabricaProducto {
    @Override
    public Producto crearProducto() {
        return new ProductoConcretoB();
    }
}
