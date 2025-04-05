# BuscaFilme - Aplicativo de Busca de Filmes

## Visão Geral do Projeto

Aplicação Java que busca e exibe informações detalhadas sobre filmes, incluindo avaliações, ano de lançamento e sinopse. Desenvolvido como parte do programa Oracle Next Education (ONE).

## Funcionalidades Principais

- **Exibição de informações**: Mostra título, ano de lançamento e sinopse dos filmes
- **Sistema de avaliações**: Calcula e exibe a média de avaliações de múltiplas fontes
- **Interface simples**: Interface baseada em console de fácil utilização
- **Design modular**: Código organizado seguindo as melhores práticas de Java

## Implementação Técnica

- **Linguagem principal**: Java 17
- **Estruturas de dados**: Utiliza collections Java para cálculos de avaliação
- **Design orientado a objetos**: Segue os princípios SOLID
- **Tratamento de erros**: Inclui tratamento básico de exceções

## Como Utilizar

### Pré-requisitos

- Java 17 JDK instalado
- Maven (para gerenciamento de dependências)

### Instalação

1. Clone o repositório
2. Navegue até o diretório BuscaFilme
3. Compile o projeto:
   ```bash
   javac src/Main.java
   ```

### Execução

Execute a aplicação:

```bash
java -cp src Main
```

O programa irá:

1. Exibir informações do filme
2. Mostrar a média de avaliações calculada
3. Apresentar a sinopse do filme

## Estrutura do Projeto

```
BuscaFilme/
├── src/
│   └── Main.java        # Ponto de entrada principal da aplicação
├── .gitignore           # Regras do Git ignore
└── projeto-alura.iml    # Arquivo de configuração do projeto
```

## Melhorias Futuras

- Integração com APIs de banco de dados de filmes (OMDb API)
- Entrada de usuário para seleção de filmes
- Expansão do sistema de avaliações com reviews de usuários

## Autor

Aluno: Wilker J C Pimenta
Autor: Alura - Oracle Next Education

## Licença

Este projeto faz parte do currículo educacional e não está licenciado para uso comercial.
