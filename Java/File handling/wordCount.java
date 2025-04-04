import java.io.BufferedReader;   
import java.io.FileReader;
import java.io.IOException;   
import java.util.HashMap;     
import java.util.Map;          

public class wordCount {
    
    public static void main(String[] args) {
        /
        System.out.println("Word Frequency Counter");
        
        if (args.length == 0) {
            System.err.println("Please provide a file name as argument");
            System.exit(1); 
        }
        
        String fileName = args[0];
        Map<String, Integer> wordCounts = new HashMap<>();  
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.toLowerCase().split("\\s+");
                
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
            
            
            System.out.println("\nWord Frequencies:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.printf("%-15s: %d%n", entry.getKey(), entry.getValue());
            }
            
            System.out.println("\nTotal unique words: " + wordCounts.size());
            
        } catch (IOException e) {
           
            System.err.println("Error processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}