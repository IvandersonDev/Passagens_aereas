package Methods;

import Abstract.Passagem;

public class PassagemNacional extends Passagem {
    public PassagemNacional() {
        // Inicializa o valor da passagem para voos nacionais
        valorPassagem = 100.0; // Preço base para voos nacionais
    }

    public double calcularValorFinal() {
        // Aplica a taxa de embarque e taxa de bagagem para voos nacionais
        double taxaEmbarque = valorPassagem * 0.05;
        double taxaBagagem = valorPassagem * 0.03;
        return valorPassagem + taxaEmbarque + taxaBagagem;
    }
}