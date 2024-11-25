package comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        Tema tema = new Tema();
        tema.adjuntar(new ObserverConcreto("Observador 1"));
        tema.adjuntar(new ObserverConcreto("Observador 2"));

        tema.notificarObservers("Cambio de estado!");
    }
}
