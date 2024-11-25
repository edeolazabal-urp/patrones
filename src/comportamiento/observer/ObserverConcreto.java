package comportamiento.observer;

public class ObserverConcreto implements Observer {
    private String nombre;

    public ObserverConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void modificar(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}
