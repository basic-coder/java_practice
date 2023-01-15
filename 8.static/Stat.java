class Mobile{
    String name;
    int price;
    static String brand; //belong to class 
    static{
        brand = "Phone";
        System.out.println(brand);
    }

    public Mobile(){
        price = 200;
        System.out.println("const");
    }

    public void show(){
        System.out.println(name + " : " + price + " : " + brand);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.name + " : " + obj.price + " : " + brand);
    }
}
public class Stat {
    public static void main(String[] args) {
        Mobile m1  = new Mobile();
        m1.name = "io5";
        m1.price = 1500;
        Mobile.brand = "Apple";

        Mobile m2  = new Mobile();
        m2.name = "samsung";
        m2.price = 150;

        m1.show();
        m2.show(); 
        
        Mobile.show1(m1);

    }
}
