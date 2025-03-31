
interface Appliance {
    void turnOn();
    void turnOff();
    void increasePower();
    void decreasePower();
}


class Fan implements Appliance {
   
    private int speed;
    
    public Fan() {
        
        this.speed = 0; 
    }
    
    
    public void turnOn() {
        System.out.println(" fan is now ON.");
        speed = 1; 
    }
    
    
    public void turnOff() {
        System.out.println(" fan is now OFF.");
        speed = 0;
    }
    
    
    public void increasePower() {
        if (speed < 5) {
            speed++;
            System.out.println(" fan speed increased to " + speed);
        } else {
            System.out.println(" fan is at maximum speed!");
        }
    }
    
    
    public void decreasePower() {
        if (speed > 1) {
            speed--;
            System.out.println(" fan speed decreased to " + speed);
        } else {
            System.out.println(" fan is at the lowest speed!");
        }
    }
}


public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance myFan = new Fan();
        
        myFan.turnOn();
        myFan.increasePower();
        myFan.increasePower();
        myFan.decreasePower();
        myFan.turnOff();
    }
}
