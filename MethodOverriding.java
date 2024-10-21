import java.time.chrono.MinguoDate;

/**       METHOD OVERRIDING
 *  - This happens when we first inherit a class, then inherit one or some of its methods
 *  - When we override, the return type should be same and also the parameters
 *  - E.g. Advance calc can inherit some methods from a base calculator
 * */

class Calc {

    public int add(int a , int b){
        return a + b;
    }
}

class AdvCalc extends Calc{

    public int add(int a , int b){
        return a + b + 1;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

    AdvCalc obj = new AdvCalc();
    int add = obj.add(2, 3);
        System.out.println(add);


    }

}
