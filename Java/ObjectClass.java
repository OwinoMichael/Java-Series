import java.lang.invoke.StringConcatFactory;

/** Every class in Java extends an OBJECT CLASS. We do not inherit on code as it happens in an abstract way
 * Object class is in java.lang.Object, we create an object of an empty class, some methods already pre-exist which
 * are methods of the Object class e.g. toString(), hashCode(), equal()
 *
 * */


class Laptop{
     String model;
     int price;

     public String toString(){
         return "hey";
     }
}

public class ObjectClass {

    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj); //Everytime we try to print an object it will call ".toString()" method
        System.out.println(obj.toString()); // Same output

    }
}
