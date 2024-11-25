package creacionales.factorymethod.estructurales.composite;

public class Empleado implements Componente{
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println(nombre);
    }
}
