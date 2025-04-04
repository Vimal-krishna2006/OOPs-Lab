import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("This is line 1");
            writer.newLine();
            writer.write("This is line 2");
            writer.newLine();
            writer.write("This is line 3");
            System.out.println("Successfully wrote to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
       
        System.out.println("\nReading from " + outputFile + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        
     
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\nSuccessfully copied content to " + inputFile);
            
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}