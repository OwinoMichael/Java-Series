
/** String is reference data type rather than a primitive that's why we use capital S
 *  When create a reference name for a string object e.g. String name, the string itself is immutable meaning
 *  we cannot manipulate it like we do for primitive datatypes e.g. int a = 1; a = a + 5;
 *
 *  Concatenation of string does not update the String Object in the memory since it a CONSTANT
 *  In the heap Memory we have String Constant Pool which stores String Objects and memory address
 *
 *  In order to mutate (change) Strings we use String Buffer or String Builder
 *
 * */

public class MutableVsImmutableString {

    public static void main(String[] args) {
        String name = "Michael";
        name = name + " Owino"; //In the JVM, we create a new object in heap "Michael Owino" and changing the address pointer of "name"
                                // int the stack. Java Garbage Cpllector will handle the "Michael" object since it will not be in use
        System.out.println("Hello " + name); //This also create another variable in the String Constant Pool
        System.out.println(name.charAt(2));

        String s1 = "Michael";
        String s2 = "Michael"; // In this case, a new object is not created in the heap memory, String Constant pool will be checked to see if
                                // the string object exist, if yet we will not create a new object named "Michael Owino"

    }
}
