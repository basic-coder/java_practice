class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(" hi ");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }   
    }
}
// class B implements Runnable{
//     public void run(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println(" hello ");
//         }   
//     }
// }
public class MyThread {
    public static void main(String[] args) {
        A obj1 = new A();

        //lamda expression 
        Runnable obj2 = () -> {
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println(" hello ");
                }   
            }
        };

        Thread t1 = new Thread(obj2);

        obj1.start();
        t1.start();
    }
}
