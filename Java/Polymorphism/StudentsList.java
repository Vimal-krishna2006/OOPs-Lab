class List{
    int rollNo, age;
    String Name;

    public List( String x, int y, int z){
        this.Name= x;
        this.rollNo= y;
        this.age= z;
    }

    void printDetails(){
        System.out.println("Student Name: "+ Name);
        System.out.println("Student RollNo: "+ rollNo);
        System.out.println("Student Age: "+ age);

    }


}



public class StudentsList{
    public static void main(String[] args){
        List Obj1 = new List("Jack", 001, 10);
        List Obj2 = new List("Rose", 003, 8);
        List Obj3 = new List("John", 002, 11);

        Obj1.printDetails();
        Obj2.printDetails();
        Obj3.printDetails();

    }
}