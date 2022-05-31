/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O -
 * L - Liskov substitution principle - object of superclass shall be replaced with objects of subclass
 * I -
 * D -
 */

package violations;

class Vehicle {
    public void start() {
        System.out.println("Start a vehicle");
    }

    public void stop() {
        System.out.println("Stop a vehicle");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Start a bike");
    }

    public void stop() {
        System.out.println("Stop a bike");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Start a car");
    }

    public void stop() {
        System.out.println("Stop a car");
    }
}

public class SolidLViolation {

     static void testDrive(Vehicle vehicle) {
         vehicle.start();
         vehicle.stop();
     }

    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
