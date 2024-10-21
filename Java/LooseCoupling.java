
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Programming on Laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Programming on Desktop");
    }
}

class Programmer{

    public void code(Computer com){
        System.out.println("Coding...");
        com.code();
    }
}

public class LooseCoupling {

    public static void main(String [] args){

        Computer laptop = new Desktop();
        Computer desktop = new Laptop();

        Programmer programmer = new Programmer();
        programmer.code(laptop);
        programmer.code(desktop);


    }

}
