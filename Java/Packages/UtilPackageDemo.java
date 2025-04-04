import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UtilPackageDemo {

    public static void main(String[] args) {
        // 1. Using Scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
       
        List<String> names = new ArrayList<>();
        names.add(name);
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("\nNames list: " + names);
        
      
        Collections.sort(names);
        System.out.println("Sorted names: " + names);
        
        
        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        System.out.println("Random name selected: " + names.get(randomIndex));


    
        Date now = new Date();
        System.out.println("\nCurrent date/time: " + now);
        
       
        Map<String, Integer> nameAges = new HashMap<>();
        nameAges.put(name, random.nextInt(25) );
        nameAges.put("Alice", 25);
        nameAges.put("Bob", 30);
        nameAges.put("Charlie", 35);
        
        System.out.println("\nName-Age mappings:");
        for (Map.Entry<String, Integer> entry : nameAges.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " years old");
        }
        
        scanner.close();
    }
}