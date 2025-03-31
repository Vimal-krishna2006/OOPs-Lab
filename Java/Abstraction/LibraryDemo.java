
abstract class LibraryItem {
    String title;
    String author;
    
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void borrowItem();
    abstract void returnItem();
    
    public void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author);
    }
}


class Book extends LibraryItem {
    private boolean isBorrowed;
    
    public Book(String title, String author) {
        super(title, author);
        this.isBorrowed = false;
    }
    
    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The book '" + title + "' has been borrowed.");
        } else {
            System.out.println("The book '" + title + "' is already borrowed.");
        }
    }
    
    
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem myBook = new Book("1984", "George Orwell");
        
        myBook.displayInfo();
        myBook.borrowItem();
        myBook.returnItem();
    }
}
