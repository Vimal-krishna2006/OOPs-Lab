
class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;
    private String borrowerName;

    // Constructor
    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
        this.borrowerName = null;
    }

  
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBorrowerName() {
        return borrowerName;
    }


    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty.");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be empty.");
        }
    }

    public void setPublicationYear(int year) {
        if (year > 0 && year <= java.time.Year.now().getValue()) {
            this.publicationYear = year;
        } else {
            System.out.println("Error: Invalid publication year.");
        }
    }

    public boolean borrowBook(String borrowerName) {
        if (isAvailable) {
            if (borrowerName != null && !borrowerName.trim().isEmpty()) {
                this.borrowerName = borrowerName;
                this.isAvailable = false;
                System.out.println(title + " has been borrowed by " + borrowerName);
                return true;
            } else {
                System.out.println("Error: Borrower name cannot be empty.");
                return false;
            }
        } else {
            System.out.println("Error: Book is not available for borrowing.");
            return false;
        }
    }

    public boolean returnBook() {
        if (!isAvailable) {
            System.out.println(title + " has been returned by " + borrowerName);
            this.borrowerName = null;
            this.isAvailable = true;
            return true;
        } else {
            System.out.println("Error: This book is already available.");
            return false;
        }
    }

    public boolean isOverdue(int daysBorrowed) {
        final int MAX_BORROW_DAYS = 21;
        return !isAvailable && daysBorrowed > MAX_BORROW_DAYS;
    }

    public void displayBookInfo() {
        System.out.println("\nBook Information:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed by " + borrowerName));
    }
}


public class EncapLib {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("978-0061120084", "To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("978-0451524935", "1984", "George Orwell", 1949);


        book1.displayBookInfo();
        book2.displayBookInfo();


        book1.borrowBook("Alice Johnson");
        book2.borrowBook("Bob Smith");

        
        book1.borrowBook("Charlie Brown"); 

        
        book1.setTitle(""); 
        book2.setPublicationYear(2050); 

        
        book1.returnBook();

        System.out.println("\nOverdue Status:");
        System.out.println(book1.getTitle() + ": " + 
            (book1.isOverdue(30) ? "Overdue" : "Not overdue"));
        System.out.println(book2.getTitle() + ": " + 
            (book2.isOverdue(15) ? "Overdue" : "Not overdue"));


        System.out.println("\nAfter updates:");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}