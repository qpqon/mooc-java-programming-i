
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        while (number != 0) {
            if (number > 0) {
                System.out.println(number * number);
            }
            if (number < 0) {
                System.out.println("Unsuitable number");
            }
            System.out.println("Give a number");
            number = scanner.nextInt();
        }
    }
}
