import java.util.ArrayList;
import java.util.List;

public class Conjunto extends ComponenteCarro {
    // Lista para guardar as partes (ou outros conjuntos)
    private List<ComponenteCarro> componentes = new ArrayList<>();

    public Conjunto(String nome) {
        super(nome);
    }

    // Método para adicionar novas peças ao conjunto
    public void adicionar(ComponenteCarro componente) {
        componentes.add(componente);
    }

    // Método para remover peças, caso necessário
    public void remover(ComponenteCarro componente) {
        componentes.remove(componente);
    }

    @Override
    public double getPeso() {
        double pesoDoConjunto = 0;
        
        // O conjunto em si não tem peso. O peso dele é a soma do peso dos seus itens!
        for (ComponenteCarro c : componentes) {
            pesoDoConjunto += c.getPeso();
        }
        
        return pesoDoConjunto;
    }
}
