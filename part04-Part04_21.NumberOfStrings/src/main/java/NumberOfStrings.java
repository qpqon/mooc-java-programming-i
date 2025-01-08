
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        while (true) {
            String input = scanner.next();
            
            if (input.equals("end")) {
                System.out.println(count);
                break;
            }
            
            count++;
        }
    }
}
