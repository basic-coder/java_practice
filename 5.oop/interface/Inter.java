// class - class => extends
// class - interface => implements
// interface - interface => extends

interface A{
    int age = 15;  //final and static
    void show();
    void config();
}
interface X{
    void run();
}
class B implements A,X{
    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
public class Inter {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.age);
    }
}
