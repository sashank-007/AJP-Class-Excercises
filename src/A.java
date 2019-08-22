public class A extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}
