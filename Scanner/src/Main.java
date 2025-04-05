import java.util.Scanner;

class Investidor {
    private String nome;
    private int idade;
    private double investimentoMensal;

    public Investidor(String nome, int idade, double investimentoMensal) {
        this.nome = nome;
        this.idade = idade;
        this.investimentoMensal = investimentoMensal;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getInvestimentoMensal() {
        return investimentoMensal;
    }
}

class EntradaDados {
    private Scanner scanner;

    public EntradaDados() {
        scanner = new Scanner(System.in);
    }

    public Investidor obterDadosInvestidor() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double investimento = scanner.nextDouble();

        return new Investidor(nome, idade, investimento);
    }

    public void fecharScanner() {
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        EntradaDados entrada = new EntradaDados();
        Investidor investidor = entrada.obterDadosInvestidor();

        System.out.println(investidor.getNome() + " que tem " + investidor.getIdade() + " anos, irá investir R$ "
                + investidor.getInvestimentoMensal() + " esse mês.");

        entrada.fecharScanner();
    }
}

