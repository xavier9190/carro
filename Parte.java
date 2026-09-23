public class Parte extends ComponenteCarro {
    private double peso;

    public Parte(String nome, double peso) {
        super(nome);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        // Ao pedir o peso de uma parte, atualizamos o total parcial
        totalParcial += this.peso;
        
        // E imprimimos a mensagem exigida na atividade
        System.out.println("Somando agora o peso de " + this.nome + ": " + this.peso + ". Total parcial: " + totalParcial);
        
        return this.peso;
    }
}
