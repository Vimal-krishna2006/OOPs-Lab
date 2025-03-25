class Employee {
    String Emp_name, Mail_id, Address;
    long Emp_id, Mobile_no;

    
    public Employee(String Emp_name, String Mail_id, String Address, long Emp_id, long Mobile_no) {
        this.Emp_name = Emp_name;
        this.Mail_id = Mail_id;
        this.Address = Address;
        this.Emp_id = Emp_id;
        this.Mobile_no = Mobile_no;
    }

    void basicPay(float pay, String d) {
        float da = 0.97f * pay;
        float hra = 0.1f * pay;
        float pf = 0.12f * pay;
        float scf = 0.01f * pay;

        float grossSalary = pay + da + hra;
        float deductions = pf + scf;
        float netSalary = grossSalary - deductions;

        System.out.println("Gross Salary of " + d + ": " + grossSalary);
        System.out.println("Deduction of " + d + ": " + deductions);
        System.out.println("Net Salary of " + d + ": " + netSalary);
    }
}

class Programmer extends Employee {
    String type = "Programmer";


    public Programmer() {
        super("qwe", "qwe@gmail.com", "123 Programmer St", 9825675, 987548475);
    }

    void basicPay(float x) {
        super.basicPay(x, type);
    }
}

class Assistant_Professor extends Employee {
    String type = "Assistant Professor";

 
    public Assistant_Professor() {
        super("rty", "rty@gmail.com", "456 Assistant Professor St", 9823653, 987548475);
    }
	void basicPay(float x) {
  	      super.basicPay(x, type);
  	  }

}

class Associate_Professor extends Employee {
    String type = "Associate Professor";


    public Associate_Professor() {
        super("uio", "uio@gmail.com", "789 Associate Professor St", 34565679, 987548475);
    }
	void basicPay(float x) {
  	      super.basicPay(x, type);
   	 }

}

class Professor extends Employee {
    String type = "Professor";


    public Professor() {
        super("asd", "asd@gmail.com", "321 Professor St", 12345678, 987548475);
    }
	void basicPay(float x) {
     	   super.basicPay(x, type);
    	}

}

public class PayCal {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.basicPay(100000.0f);
System.out.println("\n");

 Assistant_Professor assistant = new Assistant_Professor();
        assistant.basicPay(200000.0f);
System.out.println("\n");

 Associate_Professor  associate = new Associate_Professor();
        associate.basicPay(500000.0f);
System.out.println("\n");

Professor professor = new Professor();
        professor.basicPay(800000.0f);
    }
}