public class Swapping {

    // We can do swappingt without using temp operator

    public static void main(String[] args) {
        int a = 0b101; //5
        int b = 0b100; //4
                        //XOR we perform XOR operation thrice
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }
}
