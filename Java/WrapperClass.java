
/**  Java is not 100% OOP, meaning some stuff are done without Class-Object classes
 *   Example: Primitive data type don't use classes meaning we effectively & efficiently save space & time
 *   since we do not have to create Objects in the HEAP MEMORY
 *
 *   But there are some applications that only require Reference Variable, e.g. Java Collections,
 *   This means the primitive data type have to be in someway made to be objects
 *   This brings the WRAPPER Class, for every primitive variable we have a wrapper class
 *   int - Integer, float - Float, double - Double
 *
 * */

public class WrapperClass {

    public static void main(String[] args) {
        int num = 7;
  //      Integer i = new Integer(num); // Deprecated way //AutoBoxing - converting primitive to reference
        Integer num1 = num; //Boxing of the data type is happening automatically

        int num2 = num1.intValue(); //Getting value from object num1 of Type Integer and store to a primitive
                                    //un-boxing
        int num3 = num1; //Auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num4 = Integer.parseInt(str);
//        int num5 = (int) str; // This will not work, we cannot cast a Reference data type to primitive data type
        System.out.println(num4*2);
    }
}
