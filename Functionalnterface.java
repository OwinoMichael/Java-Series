/**
 *  This is an interface which only has one method
 *  Single Abstract Method Interface
 *
 * */

@FunctionalInterface
interface  A {
    void show();

}

//class B implements A{
//
//}

public class Functionalnterface {
    public static void main(String[] args) {

       // A obj = new B(); // One way to use it.

        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
    }

}
