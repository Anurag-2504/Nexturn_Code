

public class Book {
    
    String tittle;
    String author;
    int price;

    public Book(String tittle, String author, int price){
        this.author=author;
        this.price=price;
        this.tittle=tittle;
    }

    public Book(Book oldBook){
        this.author=oldBook.author;
        this.price=oldBook.price;
        this.tittle=oldBook.tittle;
    }

    public void display(){
        System.out.println("Name of the book is : "+tittle);
        System.out.println("Price of the book is : "+price);
        System.out.println("Author of the book is : "+author);
    }
    public static void main(String[] args) {
       Book b1=new Book("Java Programming", "James Ghoslin", 199);
       Book b2=new Book(b1);
    
       System.out.println("Original book details : ");
       b1.display();
       System.out.println();
       System.out.println("Copied details of the book : ");
       b2.display();
    }
    
}
