

/**             "FINAL" KEY WORD
 *      It is used in variables, methods and classes to indicate we cannot manipulate inital
 *      variable / class or method defined.
 *
 * */

class A {

    final public int age = 30;

    public void show(){
        age = 35; // We get a SYNTAX error
        System.out.println("in A show");
    }

    public final int add(int a , int b){ // we cannot override this method
        return a + b;
    }
}

class B extends A{


    public int add(int a , int b){ //We get a SYTNTAX ERROR
        return a + b;
    }

}

final class C {

    public void finale(){

    }
}

class D extends C{ // we cannot inherit C

}



public class FinalKeyWord {



}
