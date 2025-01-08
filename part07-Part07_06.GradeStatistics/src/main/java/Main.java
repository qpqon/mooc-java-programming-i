
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner       = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInterface ui      = new UserInterface(scanner, calculator);
        
        ui.start();
        
        System.out.println(calculator.averageAll());
        System.out.println(calculator.averagePassing());
        System.out.println(calculator.percentPassing());
        
        calculator.printGrades();
    }
}
