package comportamiento.strategy;

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        contexto.setStrategy(new EstrategiaConcretaA());
        contexto.ejecutarStrategy();

        contexto.setStrategy(new EstrategiaConcretaB());
        contexto.ejecutarStrategy();
    }
}
