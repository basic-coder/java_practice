abstract class A{
    public abstract void run();

    public void show(){
        System.out.println("A class");
    }
}

class B extends A{

    // must declare method if base class has abstract method
    // public void run(){
    //     System.out.println("run");
    // }
    public void show(){
        System.out.println("B class");
    }
}

public class Poly {
   public static void main(String[] args) {

    final double PIE = 3.14; 
    // A obj = new A();

    // obj.show();

    A obj = new B();
    
    obj.show();

    //System.out.println(obj);
   }
}
