
/**
 * Encapsulation is restricting access of class variables to other classes directly
 * We use getters and setters method to access variable & assign/edit class variables
 *  ***NOTE*** Whenever we declare variables in a class we should make it private
 *
 * */

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Navin");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
