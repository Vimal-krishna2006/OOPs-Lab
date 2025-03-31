class Add {
    
    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Add calc = new Add();
        
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
    }
}
