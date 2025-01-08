
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first  = 0;
        int second = 0;
        
        String command = "";
        int    amount  = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            try {
                String[] parts = input.split(" ");
                command = parts[0];
                amount  = Integer.parseInt(parts[1]);
                if (amount < 0) {
                    continue;
                }
                
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
            
            if (command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
                
            } else if (command.equals("move")) {
                int moveAmount = Math.min(amount, first);
                
                first -= moveAmount;
                second += moveAmount;
                if (second > 100) {
                    second = 100;
                }
                
            } else if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}
