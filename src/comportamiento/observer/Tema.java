package comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private List<Observer> observers = new ArrayList<Observer>();

    public void adjuntar(Observer o) {
        observers.add(o);
    }
    public void notificarObservers (String mensaje) {
        for (Observer o : observers) {
            o.modificar(mensaje);
        }
    }
}
