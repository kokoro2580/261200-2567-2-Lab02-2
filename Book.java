import javax.swing.*;

public class Book {
    String title ;
    String author;
    Double price ;
    Double discount ;

    Book() {
        this("Unknow" ,"Unknow" ,1.0);
    }
    public Book(String title , String author ,Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    public void applyDiscount(double discount) {
        if (discount<0 || discount>100) {
            System.out.println("Error");
        }
        else {
            this.price = (1 - (discount / 100.0)) * price;
        }
    }
}
