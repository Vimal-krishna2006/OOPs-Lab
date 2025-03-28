import java.util.Scanner;
public class palindrome{
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner obj1 = new Scanner(System.in);
		int num = obj1.nextInt();
		int temp=num;
		int x=0;
		while(num!=0)
		{
			x= (x*10)+(num%10);
			num/=10;
		}
if(x==temp){
System.out.println("Palindrome");
}
	else	{
System.out.println("NOT a Palindrome");
}




		
}
}