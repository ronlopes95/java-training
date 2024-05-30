public class Main {
    public static void main(String[] args) {

        // Exibir media de dois resultados
        double resultadoMedia1 = 2.3;
        int resultadoMedia2 = 8;
        int mediaDosResultados = (int) resultadoMedia1 + resultadoMedia2 / 2;

        String printResultado = String.format("A media dos resultados %.2f e %d é: %d", resultadoMedia1, resultadoMedia2, mediaDosResultados);

        System.out.println(printResultado);


        // Concatene um car com uma string
        char jooj = 'C';
        String palavra = " é uma linguagem de programacao!";

        System.out.println(jooj + palavra);



        // Atribua e calcule produtos por preço
        double precoProduto = 26.90;
        int quantidadeProduto = 76;
        double produtosTotal = precoProduto * quantidadeProduto;

        String printProdutosTotal = """
                PRODUTOS EM ESTOQUE: %d UNIDADES
                PREÇO DO PRODUTO: R$ %.2f
                
                SOMA DOS PRODUTOS: R$ %.2f
                """.formatted(quantidadeProduto, precoProduto, produtosTotal);

        System.out.println(printProdutosTotal);



        // Declare var tip double valorEmDolares com um valor
        double valorEmDolares = 6.55;
        double conversao = valorEmDolares + 4.94;

        String printConversao = String.format("O valor atual do dolar e USD %.2f, convertido para real teremos R$ %.2f!", valorEmDolares, conversao);

        System.out.println(printConversao);



        // Calcular 10% de desconto num produto
        double precoOriginal = 2.95;
        double percentualDesconto = 10;
        double diferencaDesconto = precoOriginal * percentualDesconto / 100;
        double totalDesconto = precoOriginal - diferencaDesconto;


        String printDesconto = String.format("Um shampoo custa R$ %.2f. Mas com um desconto de %.2f porcento, ele passara a custar R$ %.2f", precoOriginal, percentualDesconto, totalDesconto);

        System.out.println(printDesconto);




    }
}