package comportamiento.strategy;

public class EstrategiaConcretaB implements Strategy{
    @Override
    public void ejecutar() {
        System.out.println("Estrategia B ejecutada.");
    }
}
