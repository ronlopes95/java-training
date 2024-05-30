import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        double balance =  875.00;

        String menu = """
                ***************** BANK APP *****************
                1 - Check balance
                2 - Receive cash
                3 - Transfer cash
                4 - Exit
                ********************************************
                
                Type in your selection:
                """;
        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextInt();


        if (userInput == 1) {
            System.out.println("Current balance: USD " + balance);
        }
        else if (userInput == 2) {
            System.out.println("Type the amount of cash to be received");
            double userTransferReceive = scanner.nextDouble();
            balance = balance + userTransferReceive;
            System.out.println("Success. New balance: USD " + balance);
        }
        else if (userInput == 3) {

                System.out.println("Type the amount of cash to be transferred");
                double userTransferSend = scanner.nextDouble();
                balance = balance - userTransferSend;


            System.out.println("Success. Transfer of USD " + userTransferSend + " sent. New balance: USD " + balance);
            }
        else if (userInput == 4) {
            System.out.println("Exiting bank system...");
            System.exit(0);
        }
        else {
            System.out.println("Invalid input. Terminating app.");
        }


    }
}
