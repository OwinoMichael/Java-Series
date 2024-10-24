import java.lang.classfile.ClassSignature;

/** Mostly implemented when we know a class will be used once
 *  We cannot direct call a method of an inner class using an object
 *  We must first instantiate the outer class, then call the inner class
 * */

class A {

    int age ;

    public void show(){
        System.out.println("in A show");
    }

    class B{

        public void config(){
            System.out.println("in config");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

//        A.B obj1 = new B(); // This will not work
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
