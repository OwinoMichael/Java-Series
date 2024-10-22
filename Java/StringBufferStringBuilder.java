import java.sql.SQLOutput;

/**   StringBuffer and String Builder allows use to mutate or change strings
 *
 *    StringBuffer is thread safe while StringBuilder is not thread safe
 * */


public class StringBufferStringBuilder {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Michael"); // we will have 23 characters since the JVM always creates a 16 character
                                                                 // buffer in the heap memory
        System.out.println(stringBuffer.capacity()); //Initial size of StringBuffer usually 16 characters
        System.out.println(stringBuffer.length());

        stringBuffer.append(" Owino");
        System.out.println(stringBuffer);

        String str = stringBuffer.toString(); //To convert the StringBuffer data to String
        stringBuffer.delete(1, 3);
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(5);
        System.out.println(stringBuffer);
    }
}
