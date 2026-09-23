public abstract class ComponenteCarro {
    protected String nome;
    // Variável estática para guardar a soma global enquanto o carro é pesado
    protected static double totalParcial = 0;

    public ComponenteCarro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método que todas as peças ou conjuntos terão que implementar
    public abstract double getPeso();
}
