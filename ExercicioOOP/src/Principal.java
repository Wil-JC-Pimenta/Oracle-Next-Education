public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.nome = "Cd do Metállica";
        produto1.preco = 50;
        produto1.descontoParaPix= 10;

        double precoFinal = produto1.pegaPrecoFinal(true);

        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Nome do produto: " + produto1.preco);
        System.out.println("O valor a ser pago é " + precoFinal);


    }







}
