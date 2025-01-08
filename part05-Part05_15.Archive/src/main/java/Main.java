
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<>();
       
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String figureID = scanner.nextLine();
            
            if (figureID.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String figureName = scanner.nextLine();
            
            if (figureName.isEmpty()) {
                break;
            }
            
            Figure figure = new Figure(figureID, figureName);
            
            if (!(figures.contains(figure))) {
                figures.add(figure);
            }
        }
        
        System.out.println();
        System.out.println("==Items==");
        for (Figure figure: figures) {
            System.out.println(figure);
        }
    }
}
