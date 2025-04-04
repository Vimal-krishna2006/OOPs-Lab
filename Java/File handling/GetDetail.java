import java.util.Scanner;       // From java.util package
import java.io.File;           // From java.io package
import java.io.FileWriter;     // From java.io package
import java.io.IOException;    // From java.io package
import java.util.Date;         // From java.util package

public class GetDetail {

    public static void main(String[] args) {
        // Using java.lang package (automatically imported)
        System.out.println("Welcome to the Simple File Handler Program!");
        
        // Using java.util.Scanner for input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Using java.util.Date
        Date currentDate = new Date();
        
        // Create output string
        String output = String.format(
            "User Information:\nName: %s\nAge: %d\nRecorded on: %s\n",
            name, age, currentDate
        );
        
        System.out.println("\n" + output);
        
        // Using java.io.File and FileWriter
        File file = new File("user_info.txt");
        
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(output);
            System.out.println("Information saved to " + file.getAbsolutePath());
        } catch (IOException e) {
            // Using java.lang.Throwable methods
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        
        System.out.println("Program completed.");
    }
}