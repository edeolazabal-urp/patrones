package comportamiento.strategy;

public class EstrategiaConcretaA implements Strategy {
    @Override
    public void ejecutar() {
        System.out.println("Estrategia A ejecutada.");
    }
}
