class DisplayMessage {
    // Method to display a message without parameters
    public void showMessage() {
        System.out.println("Hello");
    }

    // Method to display a message with one parameter
    public void showMessage(String name) {
        System.out.println("Hello, " + name );
    }

    // Method to display a message with two parameters
    public void showMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        
        dm.showMessage();
        dm.showMessage("Alice");
        dm.showMessage("Bob", 25);
    }
}
