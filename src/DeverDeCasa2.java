import java.util.Scanner;

public class DeverDeCasa2 {
    public static void main(String[] args) {

//        System.out.println("Digite um numero");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//
//        if (userInput > 0) {
//            System.out.println(userInput + " é positivo");
//        }
//        else
//        {
//            System.out.println(userInput + " é negativo");
//        }

        System.out.println("Digite dois numeros");
        Scanner scanner = new Scanner(System.in);

        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        if (userInput1 < userInput2) {
            System.out.println(userInput1 + " é menor que " + userInput2);
        }
        else if (userInput1 > userInput2) {
            System.out.println(userInput1 + " é maior que " + userInput2);
        }
        else {
            System.out.println(userInput1 + " é igual a " + userInput2);
        }


    }
}
