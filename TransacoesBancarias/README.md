# TransacoesBancarias - Sistema de Simulação Bancária

## Visão Geral do Projeto

Aplicação Java que simula operações bancárias básicas, desenvolvida como parte do programa Oracle Next Education (ONE). O sistema demonstra conceitos fundamentais de programação como estruturas de controle, tratamento de exceções e manipulação de dados.

## Objetivos Educacionais

- Praticar implementação de menus interativos
- Demonstrar tratamento de entrada de usuário
- Aplicar conceitos de orientação a objetos
- Simular operações financeiras básicas

## Funcionalidades Principais

- **Operações bancárias**:
  - Consulta de saldo
  - Depósito (recebimento de valores)
  - Transferência entre contas
- **Validações**:
  - Verificação de saldo suficiente
  - Tratamento de valores inválidos
  - Prevenção de erros de entrada
- **Interface amigável**:
  - Menu interativo
  - Mensagens claras
  - Formatação de valores monetários

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Bibliotecas**:
  - java.util.Scanner (para entrada de dados)
  - java.text (para formatação monetária)
- **Padrões**:
  - Clean Code
  - Tratamento de exceções

## Estrutura do Código

```java
public class Main {
    public static void main(String[] args) {
        double saldo = 2500.00;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Consultar saldo
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 2: // Receber valor
                    System.out.print("Valor a receber: ");
                    saldo += scanner.nextDouble();
                    break;
                // ... outros casos
            }
        }
    }
}
```

## Como Executar

### Pré-requisitos

- Java 17 JDK instalado
- Terminal/Command Prompt

### Passo a Passo

1. Navegue até o diretório do projeto:

```bash
cd TransacoesBancarias
```

2. Compile o código fonte:

```bash
javac src/Main.java
```

3. Execute a aplicação:

```bash
java -cp src Main
```

4. Siga as instruções no console para interagir com o sistema

## Fluxo do Programa

1. Exibe menu de operações
2. Aguarda seleção do usuário
3. Executa operação selecionada
4. Retorna ao menu principal

## Melhorias Futuras

- Implementar sistema de autenticação
- Adicionar persistência em banco de dados
- Criar sistema de extrato
- Desenvolver interface gráfica

## Autor

Wilker J C Pimenta  
Oracle Next Education (ONE) - T6 - Alura

## Notas

Este projeto faz parte do currículo educacional e tem fins exclusivamente didáticos. Não possui conexão com sistemas bancários reais.
