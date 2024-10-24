
/** We can have method which is defined but has implementation i.e. void
 *  The only way to use it in a child class is to make the method Abstract
 *  Abstract methods must belong to an Abstract class
 *  Also we connot instantiate an Abstract class, so the only way to access the abstract method
 *  is to inherit the abstract first then access the method by instantiating the child class
 *
 *  Abstract can hold either or both abstract and non-abstract methods
 *
 *  A child class MUST implement all abstract methods of the Abstract Super Class or become also an abstract class
 *
 *
 * */

abstract class Car{
    public abstract void drive();
    public abstract void autoPark();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Ford extends Car{

    public void drive(){
        System.out.println("Driving...");
    }
}

class Mustang extends Ford{
    public void drive(){
        System.out.println("Driving...");
    }

    public void autoPark() {
        System.out.println("Parking ...");
    }
}

public class AbstractKeyWord {

    public static void main(String[] args) {
//        Car obj = new Car(); // You cannot create method of an abstract class
        Car obj = new Mustang();
        obj.drive(); // It will the method of Car
        obj.playMusic();
    }
}
