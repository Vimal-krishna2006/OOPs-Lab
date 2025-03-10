import java.util.Scanner;

public class Vowel {

    // Function to find whether an input 
    // character is vowel or not 
    static void VowelCheck(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' ||
            y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U') {
            System.out.println("It is a Vowel.");
        } else {
            System.out.println("It is a Consonant.");
        }
    }

    // The Driver code 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char in = obj.next().charAt(0); // Fix for reading a single character
        VowelCheck(in);
    }
}
