package snippetquestion3;


public class Main {
    public static void main(String[] args) {
    	Vehicle animal = new Car();
    	Car dog = (Car)animal.getVehicle();
        System.out.println(dog.getClass());
    }
}

class Vehicle {
    public Vehicle getVehicle() {
        return new Vehicle();
    }
}
class Car extends Vehicle {
    @Override
    public Car getVehicle() {
        return new Car();
    }
}

