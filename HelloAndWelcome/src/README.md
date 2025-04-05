# HelloAndWelcome - Projeto de Boas-Vindas

## Visão Geral do Projeto

Projeto Java simples desenvolvido como introdução à programação, demonstrando conceitos básicos como saída de console e estruturas de repetição. Parte do programa Oracle Next Education (ONE).

## Objetivos Educacionais

- Introduzir a sintaxe básica do Java
- Demonstrar o uso de estruturas de controle
- Mostrar saída básica no console
- Servir como primeiro contato com a IDE IntelliJ

## Funcionalidades

- Exibe mensagem de boas-vindas formatada
- Demonstra loop for para contagem de 1 a 5
- Mostra saída formatada no console

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Ferramentas**:
  - IntelliJ IDEA (recomendado)
  - JDK 17+

## Como Executar

### Método 1: Via linha de comando

1. Navegue até o diretório src:

```bash
cd HelloAndWelcome/src
```

2. Compile o código:

```bash
javac Main.java
```

3. Execute o programa:

```bash
java Main
```

### Método 2: Via IntelliJ IDEA

1. Abra o projeto no IntelliJ
2. Localize o arquivo Main.java
3. Execute usando:
   - Atalho: Shift + F10
   - Ou clique no ícone de execução

## Saída Esperada

```
Hello and welcome!
i = 1
i = 2
i = 3
i = 4
i = 5
```

## Estrutura do Código

```java
public class Main {
    public static void main(String[] args) {
        // Mensagem de boas-vindas
        System.out.printf("Hello and welcome!");

        // Loop de demonstração
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

## Próximos Passos (Para Evolução do Projeto)

- Adicionar interação com usuário via Scanner
- Implementar métodos separados para diferentes funcionalidades
- Adicionar tratamento de exceções
- Converter para um sistema de mensagens mais complexo

## Autor

Wilker J C Pimenta  
Oracle Next Education (ONE) - T6 - Alura

## Notas

Este projeto faz parte do currículo educacional e tem fins exclusivamente didáticos.
