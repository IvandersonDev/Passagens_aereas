package Methods;

import Abstract.Passagem;

public class PassagemInternacional extends Passagem {
    public PassagemInternacional() {
        // Inicializa o valor da passagem para voos internacionais
        valorPassagem = 300.0; // Preço base para voos internacionais
    }

    public double calcularValorFinal() {
        // Aplica a taxa de embarque e taxa de bagagem para voos internacionais
        double taxaEmbarque = valorPassagem * 0.10;
        double taxaBagagem = valorPassagem * 0.05;
        return valorPassagem + taxaEmbarque + taxaBagagem;
    }
}