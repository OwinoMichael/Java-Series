
/**   STATIC BLOCK
 *  If we have both static and not static variable, we can define a constructor.
 *  What if we want to static block to be instantiated once? We will not mention it the constructor
 *  What we can do is initialize it in a STATIC BLOCK.
 *
 *  What happens create an object of a class e.g. Mobile mobile = new Mobile() ?
 *  Inside the JVM, we have component called CLASS LOADER which first loads the class, the create an OBJECT of
 *  the class in the heap memory.
 * */
class Mobile {
    String name;
    int price;
    static String brand;

    static{
        brand = "Phone";
        System.out.println("In static block");
    }

    public Mobile(){
        name = "";
        price = 1200;
        System.out.println("In constructor");
    }

        public void show(){
        System.out.println(brand + " : " + price + " : " +name);
    }


}
public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); //We want to call the call & Instantiate the class and NOT create an object
                                            //The line above will Load the class but not create an Object.
                                            //In loading the class, the static block will be called
//        Mobile mb = new Mobile();
//        mb.name = "Iphone 12";
//        mb.price = 1200;
//
//        Mobile mb1 = new Mobile(); //Running the code we static block is called once but constructor is called twice


    }
}
