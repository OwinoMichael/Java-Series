
/**  Static Methods allow for calling of methods without creating objects / instantiation
 *   Example: public static void main(String [] args){} Is NEVER instantiated
 *
 *   We can access static variables in static methods directly but not non-static variables
 *   For non-static variables we need to access them using class object in static methods
 * */

class Mobile{
    String name;
    int price;
    int year;
    static String brand;

    public void show(){
        System.out.println(brand + " : " + price + " : " + year + " : " +name);
    }

    public static void show1(Mobile obj){ //To be able to access price, year & name we have to create an Object of Mobile class
        System.out.println(brand + " : " + obj.price + " : " + obj.year + " : " +obj.name);
    }
}

public class StaticMethods {

    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.name = "Iphone 12";
        mb.price = 1200;
        mb.year = 2020;
        Mobile.brand = "Iphone";
        mb.show();

        Mobile sb = new Mobile();
        sb.name = "Iphone 13";
        sb.price = 1399;
        sb.year = 2021;
        Mobile.brand = "Iphone";
        sb.show();

        Mobile.show1(mb); // In order to access non-static variable we use an object in method

    }
}
