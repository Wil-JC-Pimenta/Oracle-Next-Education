# SwitchCase - Demonstração de Estruturas de Controle em Java

## Visão Geral do Projeto

Projeto educacional que exemplifica o uso da estrutura switch-case em Java, desenvolvido como parte do programa Oracle Next Education (ONE). O código demonstra diferentes abordagens para controle de fluxo em aplicações Java.

## Objetivos de Aprendizado

- Demonstrar a sintaxe do switch-case em Java
- Comparar com estruturas if-else
- Mostrar a evolução do switch nas versões do Java
- Ilustrar boas práticas de estruturas de controle

## Funcionalidades

- **Exemplos completos** de switch-case:
  - Versão tradicional (Java 8)
  - Switch expression (Java 14+)
  - Pattern matching (Java 17+)
- **Casos de uso práticos**:
  - Controle de menus
  - Processamento de opções
  - Mapeamento de valores

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Recursos**:
  - Switch expressions
  - Pattern matching
  - Arrow syntax
- **Ferramentas**:
  - IntelliJ IDEA
  - Maven

## Estrutura do Código

```java
public class Main {
    public static void main(String[] args) {
        int opcao = 2;

        // Switch tradicional
        switch(opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Switch expression (Java 14+)
        String resultado = switch(opcao) {
            case 1 -> "Opção 1";
            case 2 -> "Opção 2";
            default -> "Inválida";
        };
    }
}
```

## Como Executar

1. Clone o repositório
2. Navegue até o diretório:

```bash
cd SwitchCase
```

3. Compile o código:

```bash
javac src/Main.java
```

4. Execute o programa:

```bash
java -cp src Main
```

## Melhores Práticas Demonstradas

- Uso de break para evitar fall-through
- Organização de casos lógicos
- Tratamento de default case
- Utilização de enums com switch

## Evolução do Switch

| Versão Java | Recurso            | Exemplo no Projeto |
| ----------- | ------------------ | ------------------ |
| Java 8      | Switch tradicional | Main.java          |
| Java 14     | Switch expressions | Main.java          |
| Java 17     | Pattern matching   | Main.java          |

## Autor

Wilker J C Pimenta  
Oracle Next Education (ONE) - T6 - Alura

## Licença

Projeto educacional desenvolvido como parte do programa ONE.
