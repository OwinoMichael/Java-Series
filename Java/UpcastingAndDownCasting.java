
class A{

    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2(){
        System.out.println("in B show");
    }
}


public class UpcastingAndDownCasting {
    public static void main(String[] args) {

        //typecasting
        double a = 4.5;
        int i = (int) a; // We will lose 0.5 value
        System.out.println(i);

        //This happens implicitly, we don't have to mention it " (A) "
        A obj = (A) new B(); //Object is of type class B, but we type cast to A
        obj.show1();    // Upcasting

        //Down-casting
        B obj1 = (B) obj;
        obj1.show2();

    }
}
