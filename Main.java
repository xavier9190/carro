public class Main {
    public static void main(String[] args) {
        // 1. Criando as partes do Trem de Força
        Parte motor = new Parte("Motor", 150.0);
        Parte transmissao = new Parte("Transmissao", 50.0);
        Parte diferencial = new Parte("Diferencial", 30.0);
        Parte rodas = new Parte("Rodas", 80.0);

        Conjunto tremDeForca = new Conjunto("Trem de Forca");
        tremDeForca.adicionar(motor);
        tremDeForca.adicionar(transmissao);
        tremDeForca.adicionar(diferencial);
        tremDeForca.adicionar(rodas);

        // 2. Criando o Chassi
        Parte suspensao = new Parte("Suspensao", 60.0);
        
        Conjunto chassi = new Conjunto("Chassi");
        chassi.adicionar(tremDeForca);
        chassi.adicionar(suspensao);

        // 3. Criando a Carroceria
        Parte paraLamas = new Parte("Para-lamas", 15.0);
        Parte portas = new Parte("Portas", 40.0);
        Parte paineis = new Parte("Paineis", 25.0);
        Parte portaMalas = new Parte("Porta-malas", 20.0);
        Parte capo = new Parte("Capo", 15.0);

        Conjunto carroceria = new Conjunto("Carroceria");
        carroceria.adicionar(paraLamas);
        carroceria.adicionar(portas);
        carroceria.adicionar(paineis);
        carroceria.adicionar(portaMalas);
        carroceria.adicionar(capo);

        // 4. Montando o Carro inteiro
        Conjunto carro = new Conjunto("Carro");
        carro.adicionar(chassi);
        carro.adicionar(carroceria);

        // 5. Calculando o peso total
        System.out.println("Iniciando a pesagem do carro...\n");
        double pesoTotal = carro.getPeso();
        System.out.println("\nO peso total do carro final é: " + pesoTotal + " kg");
    }
}
