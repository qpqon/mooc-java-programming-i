/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class Book {
    private String title;
    private String pages;
    private String publicationYear;
    
    public Book(String title, String pages, String year) {
        this.title           = title;
        this.pages           = pages;
        this.publicationYear = year;
    }
    
    public void printTitle() {
        System.out.println(this.title);
    }
    
    public void printEverything() {
        System.out.println(
                this.title + ", " + this.pages + " pages, " + this.publicationYear
        );
    }
}

//Title: To Kill a Mockingbird
//Pages: 281
//Publication year: 1960