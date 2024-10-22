
/**  Static Variable allows an instance variable value to be shared across different objects
 *   It is good practice to always the Class Name to access static variable
 * */

class Mobile{
    String name;
    int price;
    int year;
    static String brand;

    public void show(){
        System.out.println(brand + " : " + price + " : " + year + " : " +name);
    }
}

public class StaticVariable {

    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.name = "Iphone 12";
        mb.price = 1200;
        mb.year = 2020;
        Mobile.brand = "Iphone"; //To access static variable we do not use the object created
        mb.show();

        Mobile sb = new Mobile();
        sb.name = "Iphone 13";
        sb.price = 1399;
        sb.year = 2021;
        Mobile.brand = "Iphone"; //To access static variable we do not use the object created
        sb.show();

    }
}
