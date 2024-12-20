import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Foreach {

    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 6);

        Consumer<Integer> consumer = n -> System.out.println(n);



        nums.forEach(consumer);

//        nums.forEach( n ->System.out.println(n));


    }
}
