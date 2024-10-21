
/**
 * We use getters and setters method to access variable & assign/edit class variables
 *  When we auto generate getters and setter, it has "this." inside the methods
 *  "this." key word is used to identify the INSTANCE Variable
 *  what is declared in the function is LOCAL Variable
 *
 *  When we want the local variable and Instance variable to have the same name ...
 *  we use "this" key word
 * <p>
 * */

class Humans {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SettersAndGetters {

    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setAge(20);
        obj.setName("Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
