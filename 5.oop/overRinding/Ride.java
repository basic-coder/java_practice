class A{
    public void show(){
        System.out.println("A show");
    }
    public void config(){
        System.out.println("config");
    }
}

class B extends A{
    public void show(){
        System.out.println("B show");
    }
}

public class Ride {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();
    }
}