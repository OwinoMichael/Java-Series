/**
 *  This is an expression used to represent a functional's interface method
 *  Instead of writing the method name we can use " () -> "
 *
 * */

@FunctionalInterface
interface  A {
    void show(int i);

}



public class LambdaExpressions {
    public static void main(String[] args) {

        // A obj = new B(); // One way to use it.

        A obj = (int i) ->
                System.out.println("This () -> is laambda " + " " + i );
        obj.show(5);

    }

}
