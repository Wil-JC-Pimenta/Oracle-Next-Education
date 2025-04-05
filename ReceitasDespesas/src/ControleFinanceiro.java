import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Receita {
    private double valor;
    private String descricao;

    public Receita(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

class Despesa {
    private double valor;
    private String descricao;

    public Despesa(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

public class ControleFinanceiro {
    private List<Receita> receitas;
    private List<Despesa> despesas;

    public ControleFinanceiro() {
        receitas = new ArrayList<>();
        despesas = new ArrayList<>();
    }

    public void adicionarReceita(double valor, String descricao) {
        receitas.add(new Receita(valor, descricao));
    }

    public void adicionarDespesa(double valor, String descricao) {
        despesas.add(new Despesa(valor, descricao));
    }

    public void exibirReceitas() {
        System.out.println("Receitas:");
        for (Receita receita : receitas) {
            System.out.println(receita.getDescricao() + ": R$" + receita.getValor());
        }
    }

    public void exibirDespesas() {
        System.out.println("Despesas:");
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricao() + ": R$" + despesa.getValor());
        }
    }

    public void modificarReceita(int indice, double novoValor, String novaDescricao) {
        Receita receita = receitas.get(indice);
        receita.setValor(novoValor);
        receita.setDescricao(novaDescricao);
    }

    public void modificarDespesa(int indice, double novoValor, String novaDescricao) {
        Despesa despesa = despesas.get(indice);
        despesa.setValor(novoValor);
        despesa.setDescricao(novaDescricao);
    }

    public void excluirReceita(int indice) {
        receitas.remove(indice);
    }

    public void excluirDespesa(int indice) {
        despesas.remove(indice);
    }

    public double calcularSaldoAtual() {
        double totalReceitas = receitas.stream().mapToDouble(Receita::getValor).sum();
        double totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
        return totalReceitas - totalDespesas;
    }

    public double calcularReceitaTotal() {
        return receitas.stream().mapToDouble(Receita::getValor).sum();
    }

    public double calcularDespesaTotal() {
        return despesas.stream().mapToDouble(Despesa::getValor).sum();
    }

    public void exibirSaldoAtual() {
        System.out.println("Saldo Atual: R$" + calcularSaldoAtual());
    }

    public void exibirReceitaTotal() {
        System.out.println("Receita Total: R$" + calcularReceitaTotal());
    }

    public void exibirDespesaTotal() {
        System.out.println("Despesa Total: R$" + calcularDespesaTotal());
    }

    public static void main(String[] args) {
        ControleFinanceiro controle = new ControleFinanceiro();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bem-vindo ao seu controle financeiro pessoal!");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Receita");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Exibir Receitas");
            System.out.println("4 - Exibir Despesas");
            System.out.println("5 - Modificar Receita");
            System.out.println("6 - Modificar Despesa");
            System.out.println("7 - Excluir Receita");
            System.out.println("8 - Excluir Despesa");
            System.out.println("9 - Exibir Saldo Atual");
            System.out.println("10 - Exibir Receita Total");
            System.out.println("11 - Exibir Despesa Total");
            System.out.println("12 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da receita:");
                    double valorReceita = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite a descrição da receita:");
                    String descricaoReceita = scanner.nextLine();
                    controle.adicionarReceita(valorReceita, descricaoReceita);
                    break;
                case 2:
                    System.out.println("Digite o valor da despesa:");
                    double valorDespesa = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite a descrição da despesa:");
                    String descricaoDespesa = scanner.nextLine();
                    controle.adicionarDespesa(valorDespesa, descricaoDespesa);
                    break;
                case 3:
                    controle.exibirReceitas();
                    break;
                case 4:
                    controle.exibirDespesas();
                    break;
                case 5:
                    System.out.println("Digite o índice da receita que deseja modificar:");
                    int indiceReceita = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite o novo valor da receita:");
                    double novoValorReceita = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite a nova descrição da receita:");
                    String novaDescricaoReceita = scanner.nextLine();
                    controle.modificarReceita(indiceReceita, novoValorReceita, novaDescricaoReceita);
                    break;
                case 6:
                    System.out.println("Digite o índice da despesa que deseja modificar:");
                    int indiceDespesa = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite o novo valor da despesa:");
                    double novoValorDespesa = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite a nova descrição da despesa:");
                    String novaDescricaoDespesa = scanner.nextLine();
                    controle.modificarDespesa(indiceDespesa, novoValorDespesa, novaDescricaoDespesa);
                    break;
                case 7:
                    System.out.println("Digite o índice da receita que deseja excluir:");
                    int indiceExcluirReceita = scanner.nextInt();
                    controle.excluirReceita(indiceExcluirReceita);
                    break;
                case 8:
                    System.out.println("Digite o índice da despesa que deseja excluir:");
                    int indiceExcluirDespesa = scanner.nextInt();
                    controle.excluirDespesa(indiceExcluirDespesa);
                    break;
                case 9:
                    controle.exibirSaldoAtual();
                    break;
                case 10:
                    controle.exibirReceitaTotal();
                    break;
                case 11:
                    controle.exibirDespesaTotal();
                    break;
                case 12:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
