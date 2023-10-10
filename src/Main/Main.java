package Main;

import Abstract.Passagem;
import Interfaces.AbstractPassagemFactory;
import Methods.PassagemInternacionalFactory;
import Methods.PassagemNacionalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de passagem:");
        System.out.println("1. Passagem Nacional");
        System.out.println("2. Passagem Internacional");

        int escolha = scanner.nextInt();
        AbstractPassagemFactory factory;
        String tipoPassagem;

        if (escolha == 1) {
            factory = new PassagemNacionalFactory();
            tipoPassagem = "Nacional";
        } else if (escolha == 2) {
            factory = new PassagemInternacionalFactory();
            tipoPassagem = "Internacional";
        } else {
            System.out.println("Escolha inválida. Saindo do programa.");
            return;
        }

        Passagem passagem = factory.criarPassagem();
        double valorFinal = passagem.calcularValorFinal();

        System.out.println("Tipo de Passagem: " + tipoPassagem);
        System.out.println("Valor Final da Passagem: " + valorFinal);

        scanner.close();
    }
}
