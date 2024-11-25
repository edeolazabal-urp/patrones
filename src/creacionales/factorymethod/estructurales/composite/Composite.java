package creacionales.factorymethod.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Componente{
    private List<Componente> hijos = new ArrayList<Componente>();

    public void agregar(Componente componente){
        hijos.add(componente);
    }

    @Override
    public void mostrar() {
        for (Componente componente : hijos) {
            componente.mostrar();
        }
    }
}
