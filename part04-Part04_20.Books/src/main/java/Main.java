import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books   = new ArrayList<>();
        Scanner         scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            String pages = scanner.nextLine();
            
            System.out.print("Publication year: ");
            String year = scanner.nextLine();
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println();
        System.out.print("What information will be printed? ");
        
        String printCode = scanner.nextLine();
        if (printCode.equals("everything")) {
            for (Book book: books) {
                book.printEverything();
            }
        } else if (printCode.equals("name")) {
            for (Book book: books) {
                book.printTitle();
            }
        }
    }
}
