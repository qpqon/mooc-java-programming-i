
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String userInput1 = scanner.nextLine();        
        String userInput2 = scanner.nextLine();
        
        if(userInput1.equals(userInput2)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        } 
    }
}
