# Sacanner - Sistema de Captura de Dados Financeiros

## Visão Geral do Projeto

Aplicação Java para coleta e processamento de dados de investimento pessoal, desenvolvido como parte do programa Oracle Next Education (ONE). O sistema permite registrar informações financeiras básicas através de entrada via console.

## Objetivos

- Demonstrar o uso da classe Scanner em Java
- Coletar e validar dados do usuário
- Exibir informações formatadas
- Introduzir conceitos básicos de entrada/saída em Java

## Funcionalidades Principais

- **Captura de dados**:
  - Nome do investidor
  - Idade
  - Valor mensal de investimento
- **Validação básica** de entrada de dados
- **Exibição formatada** das informações coletadas

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Bibliotecas**:
  - java.util.Scanner (para entrada de dados)
- **Ferramentas**:
  - IntelliJ IDEA (ambiente de desenvolvimento recomendado)

## Como Executar

### Pré-requisitos

- Java 17 JDK instalado
- Maven (para gerenciamento de dependências)

### Passo a Passo

1. Navegue até o diretório do projeto:

```bash
cd Sacanner
```

2. Compile o código fonte:

```bash
javac src/Main.java
```

3. Execute a aplicação:

```bash
java -cp src Main
```

4. Siga as instruções no console para inserir seus dados

## Fluxo do Programa

1. Solicita nome do usuário
2. Coleta a idade
3. Pergunta sobre valor de investimento mensal
4. Exibe todas as informações formatadas

## Estrutura do Projeto

```
Sacanner/
├── src/
│   └── Main.java        # Classe principal com lógica de interação
├── .gitignore           # Configurações do Git
└── sacanner.iml         # Configuração do projeto IntelliJ
```

## Melhorias Planejadas

- Adicionar validação robusta de entrada
- Implementar cálculos de juros compostos
- Adicionar persistência em arquivo
- Criar interface gráfica simples

## Autor

Aluno: Wilker J C Pimenta
Autor: Alura - Oracle Next Education

## Licença

Projeto educacional desenvolvido como parte do programa ONE. Não destinado para uso comercial.
