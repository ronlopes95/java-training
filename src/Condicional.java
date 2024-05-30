public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2022) {
            System.out.println("Filmes lancados apos 2022");
        } else if (anoDeLancamento < 2022) {
            System.out.println("Filmes lancados antes de 2022");
        } else {
            System.out.println("Filme lancado no mesmo ano");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Permitir assistir filme");
        } else {
            System.out.println("Deve comprar plano");
        }

    }}





