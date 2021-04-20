
package lab.pkg8;
import java.util.Scanner;

public class Assignment1_runner {
    public static void main(String[] args){
        Book b = new Book();
        Tape t = new Tape();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter title of the book: ");
        b.setTitle(s.next());
        
        System.out.println("Ente price of book : ");
        b.setPrice(s.nextDouble());
        
        System.out.println("Enter number of pages of the book : ");
        b.setPagecount(s.nextInt());
        
        
        
        System.out.println("\nEnter title of the Tape: ");
        t.setTitle(s.next());
        
        System.out.println("Ente price of Tape : ");
        t.setPrice(s.nextDouble());
        
        System.out.println("Enter Playing minutes of tape : ");
        t.setMinutes(s.nextInt());
        
        b.display();
        t.display();
                
        
    
    }
    
}
