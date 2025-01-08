
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            String input = scanner.nextLine();

            int number = Integer.valueOf(input);

            if (number == 4) {
                break;
            }
        }
    }
}
