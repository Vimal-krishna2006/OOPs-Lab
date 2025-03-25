
class Room {
    double length;
    double width;

  
    Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    double calculateArea() {
        return length * width;
    }
}


class RoomVolume extends Room {
    double height;

  
    RoomVolume(double length, double width, double height) {
        super(length, width); // Call the base class constructor
        this.height = height;
    }


    double calculateVolume() {
        return calculateArea() * height; // Using the area method from the base class
    }
}


public class RoomVol {
    public static void main(String[] args) {
        // Create an object of the RoomVolume class
        RoomVolume room = new RoomVolume(10, 5, 3);

        // Calculate and display the area of the room
        System.out.println("Area of the room: " + room.calculateArea() + " square units");

        // Calculate and display the volume of the room
        System.out.println("Volume of the room: " + room.calculateVolume() + " cubic units");
    }
}