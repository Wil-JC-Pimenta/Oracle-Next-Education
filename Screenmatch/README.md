# Screenmatch - Sistema de Gerenciamento de Filmes e Séries

## Visão Geral do Projeto

Aplicação Java avançada para gerenciamento de catálogo de filmes e séries, desenvolvida como parte do programa Oracle Next Education (ONE). O sistema permite organizar, classificar e calcular tempos de visualização de conteúdo audiovisual.

## Objetivos Principais

- Demonstrar conceitos avançados de Orientação a Objetos
- Implementar sistema de classificação de conteúdo
- Calcular tempos totais de visualização
- Praticar consumo de APIs externas (OMDb)

## Funcionalidades

- **Cadastro de títulos**:
  - Filmes (com duração em minutos)
  - Séries (com temporadas e episódios)
- **Sistema de avaliação**:
  - Classificação por estrelas
  - Filtro por recomendação
- **Cálculos**:
  - Tempo total para maratonar séries
  - Média de avaliações
- **Integração com OMDb API**:
  - Busca automática de metadados
  - Carregamento de pôsteres

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Bibliotecas**:
  - Jackson (para manipulação de JSON)
  - java.net (para requisições HTTP)
- **API Externa**: OMDb API
- **Ferramentas**:
  - IntelliJ IDEA
  - Maven

## Estrutura do Projeto

```
Screenmatch/
├── src/
│   └── br/com/alura/screenmatch/
│       ├── calculos/              # Classes de cálculos
│       ├── excecao/               # Tratamento de exceções
│       ├── modelos/               # Entidades do sistema
│       └── principal/             # Classes principais
├── filmes.json                    # Dados de exemplo
├── .gitignore
└── screenmatch.iml
```

## Como Executar

### Pré-requisitos

- Java 17 JDK
- Chave de API OMDb (opcional)
- Maven

### Passo a Passo

1. Clone o repositório
2. Navegue até o diretório:

```bash
cd Screenmatch
```

3. Compile o projeto:

```bash
mvn compile
```

4. Execute a aplicação principal:

```bash
mvn exec:java -Dexec.mainClass="br.com.alura.screenmatch.principal.Principal"
```

## Exemplos de Uso

1. Cadastrar novo filme:

```java
Filme meuFilme = new Filme("Interestelar", 2014);
meuFilme.setDuracaoEmMinutos(169);
```

2. Classificar um título:

```java
meuFilme.avalia(8.5);
meuFilme.avalia(9.0);
```

3. Calcular média:

```java
double media = meuFilme.pegaMedia();
```

## Melhorias Futuras

- Interface gráfica com JavaFX
- Persistência em banco de dados
- Sistema de usuários e listas personalizadas
- Recomendações baseadas em machine learning

## Autor

Aluno: Wilker J C Pimenta
Autor: Alura - Oracle Next Education

## Licença

Projeto desenvolvido para fins educacionais como parte do programa ONE.
