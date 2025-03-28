import java.util.Scanner;
public class SumNatural {

    public static void main(String[] args) {
System.out.println("Enter a number: ");
       Scanner obj1 = new Scanner(System.in);
		int num = obj1.nextInt();
 int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}