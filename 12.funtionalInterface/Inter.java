@FunctionalInterface
interface A{
    void show(int i);
    void add(int i, int j);
}

public class Inter {
    public static void main(String[] args) {
        A obj = (int i) -> System.out.println("is show " + i);
        A obj2 = (int i, int j ) -> i + j;

        obj.show(5);
    }
}
