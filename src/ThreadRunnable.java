public class ThreadRunnable extends Thread {

    private Thread t;
    private String threadName;

    ThreadRunnable(String name){
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    public void run(){
        System.out.println(threadName+" is running.");

        try {
            for(int i=4;i<0;i--){
                System.out.println("Thread "+threadName+" , "+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread "+threadName+" interrupted");
        }
        System.out.println(threadName+" exists");
    }

    public void start(){
        System.out.println(threadName+" is starting");
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        ThreadRunnable t1 = new ThreadRunnable("Thread 1");
        t1.start();

        ThreadRunnable t2 = new ThreadRunnable("Thread 2");
        t2.start();
    }
}
