import java.util.Scanner;


public class HybridCalc{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("\n 1. Multiply \n 2.Factorial \n 3.Permutation \n 4.Combination");
        int n = obj.nextInt();
        int a;
        int b;
        int ans;

        switch(n){
            case 1:
                System.out.println("Enter First No. :");
                a = obj.nextInt();
                System.out.println("Enter Second No. :");
                b = obj.nextInt();
                ans= multiply.prod(a,b);
                System.out.println("Product = "+ans);
                break;

            case 2:
                System.out.println("Enter No. :");
                a = obj.nextInt();
                ans= factorial.fact(a);
                System.out.println("Factorial = "+ans);
                break;

            case 3:
                System.out.println("Enter First No. :");
                a = obj.nextInt();
                System.out.println("Enter Second No. :");
                b = obj.nextInt();
                ans= permutation.perm(a,b);
                System.out.println("Permutation = "+ans);
                break;

            case 4:
                System.out.println("Enter First No. :");
                a = obj.nextInt();
                System.out.println("Enter Second No. :");
                b = obj.nextInt();
                ans= combination.comb(a,b);
                System.out.println("Combination = " +ans);
                break;

        }

       

    }
}

class multiply{
    static int prod(int a, int b){
        return a*b;
    }
}

class factorial{
    
    static int fact(int i){

        int res=1;
        while(i-1 >0){
            int temp= multiply.prod(i, i-1);
            
            i = i-2;
            res= res*temp;

        }
        return res;
    }
}

class permutation{
    static int perm(int a, int b){
        int x=  factorial.fact(a);
        int y=  factorial.fact(b);
        int z=  factorial.fact(a-b);

        return x/(z);
    }
}

class combination{
    static int comb(int a, int b){
        int x=  factorial.fact(a);
        int y=  factorial.fact(b);
        int z=  factorial.fact(a-b);

        return x/(y*z);
    }
}