package comportamiento.strategy;

public class Contexto {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void ejecutarStrategy() {
        strategy.ejecutar();
    }
}
