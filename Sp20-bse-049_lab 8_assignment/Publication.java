
package lab.pkg8;

public class Publication {
    protected String title;
    protected double price;
    
    public Publication(){
    }

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    
    public void display(){
        System.out.println("Title is : " + title + "\nPrice is : " + price);
    }
    
}

class Book extends Publication{
    private int pagecount;

    public Book(int pagecount, String title, double price) {
        super(title, price);
        this.pagecount = pagecount;
    }

    public Book() {
        
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void display(){
        super.display();
        System.out.println("total page of the book is : " + pagecount);
    }
    
    
}

class Tape extends Publication {
    private int minutes;

    public Tape(int minutes, String title, double price) {
        super(title, price);
        this.minutes = minutes;
    }

    Tape() {
        
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }
    
    public void display(){
        super.display();
        System.out.println("Playing time in minutes is " + minutes);
    }
    
}
