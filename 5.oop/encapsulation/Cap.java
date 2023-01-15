class Human{
    private int age;
    private String name = "bhavesh";

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Cap {
    public static void main(String[] args) {
        Human p1 = new Human();
        p1.setAge(21); 

        System.out.println(p1.getAge() + " " + p1.getName());

    }
}
