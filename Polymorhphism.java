
/**             POLYMORPHISM
 *  Can occur when a method has many behaviors
 *  We have two types of Polymorphism i.e. Compile time Polymorphism and Runtime Polymorphism
 *  Compile time polymorphism can be in form on method overloading
 *  Run time polymorphism can be in form on method overriding
 *
 * */

class A {

    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("config in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}


public class Polymorhphism {

    public static void main(String[] args) {
        A obj = new B();
        obj.show(); //This method is going to be decided in Runtime

        obj.config();



    }
}
