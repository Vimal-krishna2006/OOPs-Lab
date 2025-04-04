import BuiltTwo.*;

public class MathPack{
    public static void main(String[] args){

       MathUtils obj= new MathUtils();
       int x=obj.add(2,2);
       int y=obj.factorial(5);
       boolean z=obj.isPrime(17);

       System.out.println(x);
       System.out.println(y);
       System.out.println(z);

    }
}