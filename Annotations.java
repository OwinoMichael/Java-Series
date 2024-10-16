
/**
 * These means a Supplement to the Compile or Runtime, we also call it a metadata
 *
 * Sometimes we want to interact with a compiler i.e. we want to supply extra information to a compiler
 *
 *    Example: Override - overrides the method in super class, can also override the super class
 *             Deprecated - you can use it but Don't. Meaning the class is deprecated
 *
 *    You can create your OWN annotations
 * */

class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("This is function A");
    }
}

class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("This is function B");
    }
}


public class Annotations {

    public static void main(String[] args) {

    B obj = new B();

    obj.showTheDataWhichBelongsToThisClass();
    }

}
