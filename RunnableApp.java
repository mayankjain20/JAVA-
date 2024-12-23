

class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<10;i++){
        System.out.println("Run Method "+i);
    }
}}

public class RunnableApp {
    public static void main(String[] args) {
        for(int i=100;i<=110;i++){
            System.out.println("Main Thread "+i);
        }
        MyRunnable m=new MyRunnable();
        Thread t=new Thread(m);

        t.start();
    }
}
