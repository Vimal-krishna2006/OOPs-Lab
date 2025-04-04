import java.util.HashMap;
import java.util.Map;

class Student {
    
    private final String studentId;  
    private String name;
    private int age;
    private final Map<String, Double> grades;  
    private double gpa;

   
    public Student(String studentId, String name, int age) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 5 || age > 120) {
            throw new IllegalArgumentException("Age must be between 5 and 120");
        }
        
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = new HashMap<>();
        this.gpa = 0.0;
    }

  
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Double> getGrades() {
        return new HashMap<>(grades);

    public double getGpa() {
        return gpa;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 120) {
            throw new IllegalArgumentException("Age must be between 5 and 120.");
        }
        this.age = age;
    }

    
    public void addGrade(String subject, double grade) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be empty.");
        }
        
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }

        grades.put(subject, grade);
        calculateGpa();
    }

    public void removeGrade(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject cannot be empty.");
        }
        
        if (!grades.containsKey(subject)) {
            throw new IllegalArgumentException("No grade exists for " + subject);
        }
        
        grades.remove(subject);
        calculateGpa();
    }

    private void calculateGpa() {
        if (grades.isEmpty()) {
            gpa = 0.0;
            return;
        }

        double sum = 0.0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        gpa = sum / grades.size();
    }

    public String getLetterGrade() {
        if (gpa >= 90) return "A";
        if (gpa >= 80) return "B";
        if (gpa >= 70) return "C";
        if (gpa >= 60) return "D";
        return "F";
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + String.format("%.2f", gpa));
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Subjects and Grades:");
        
        if (grades.isEmpty()) {
            System.out.println("  No grades recorded yet");
        } else {
            for (Map.Entry<String, Double> entry : grades.entrySet()) {
                System.out.printf("  %-20s: %.2f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}


public class EncapGrad {
    public static void main(String[] args) {
        try {
           
            Student student = new Student("S1001", "Emma Watson", 20);

           
            student.displayStudentInfo();

          
            student.addGrade("Mathematics", 92.5);
            student.addGrade("Computer Science", 88.0);
            student.addGrade("Physics", 76.5);

          

           
            student.displayStudentInfo();

         
            student.removeGrade("Physics");
            student.displayStudentInfo();

            
            
            System.out.println("\nCurrent Letter Grade: " + student.getLetterGrade());
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}