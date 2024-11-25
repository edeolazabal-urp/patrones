package creacionales.factorymethod;

class FabricaA extends FabricaProducto {
    @Override
    public Producto crearProducto() {
        return new ProductoConcretoA();
    }
}
