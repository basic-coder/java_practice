enum Laptop{
    Macbook(2000), Xps(2000);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class Enum {
    public static void main(String[] args) {
    
        int i = 5;
        // Laptop s  = Laptop.Macbook;
        // System.out.println(s.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " " + lap.getPrice());
        }
    }
}
