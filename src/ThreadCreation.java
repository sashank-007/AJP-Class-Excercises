public class ThreadCreation extends Thread {

    private Thread t;
    private String threadName;

    ThreadCreation(String name){
        threadName = name;
        System.out.println("Creating "+threadName);
    }


    public void start(){
        System.out.println(threadName+" has started.");
        if(t==null){
            t = new Thread(this.threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        ThreadCreation t1 = new ThreadCreation("Thread 1");
        t1.start();

        ThreadCreation t2 = new ThreadCreation("Thread 2");
        t2.start();
    }
}
