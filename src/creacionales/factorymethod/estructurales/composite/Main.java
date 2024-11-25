package creacionales.factorymethod.estructurales.composite;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.agregar(new Empleado("Gerente General"));
        Composite subTree = new Composite();
        subTree.agregar(new Empleado("- Gerente Administrador"));
        subTree.agregar(new Empleado("- Gerente Financiero"));
        root.agregar(subTree);
        root.mostrar();

        Composite raiz2 = new Composite();
        raiz2.agregar(new Empleado("Electronico"));
        Composite subArbol2 = new Composite();
        subArbol2.agregar(new Empleado("- Televisor"));
        subArbol2.agregar(new Empleado("- Cocina"));
        raiz2.agregar(subArbol2);
        raiz2.mostrar();

    }
}
