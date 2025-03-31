class Person {
    String name;
    int age;
    String city;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Not specified";
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.city = "Not specified";
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Not specified";
    }

    // Constructor with three parameters
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("Bob", 25);
        Person p4 = new Person("Charlie", 30, "New York");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
