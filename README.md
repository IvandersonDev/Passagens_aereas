# Sistema de Emissão de Passagens Aéreas

Este é um projeto de exemplo que demonstra um sistema de emissão de passagens aéreas com suporte para passagens nacionais e internacionais, implementado em Java com o padrão Abstract Factory.

## Pré-requisitos

- Java SDK instalado (versão 1.8 ou superior)
- Gradle instalado (versão 8.2.1 ou superior)

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java/seu_pacote_seu_projeto/`:
  - `AbstractPassagemFactory.java`: Interface abstrata para a fábrica de passagens.
  - `PassagemNacionalFactory.java`: Fábrica de passagens nacionais.
  - `PassagemInternacionalFactory.java`: Fábrica de passagens internacionais.
  - `Passagem.java`: Classe abstrata para passagens.
  - `PassagemNacional.java`: Classe para passagens nacionais.
  - `PassagemInternacional.java`: Classe para passagens internacionais.

- `Main.java`: Classe principal que permite ao usuário selecionar o tipo de passagem e calcula o valor final.

## Contribuição
Sinta-se à vontade para contribuir com melhorias, correções de bugs ou novos recursos. Abra uma issue para discutir suas ideias ou envie uma pull request.
