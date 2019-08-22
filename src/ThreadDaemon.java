public class ThreadDaemon extends Thread{
    public ThreadDaemon(){
        setDaemon(true);
    }
    public void run(){
        System.out.println("Is this thread Daemon? - "+isDaemon());
    }
    public static void main(String args[]){
        ThreadDaemon td = new ThreadDaemon();
        td.run();
    }
}