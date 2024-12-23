

class Myclass extends  Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("From Run Method i "+i);
        }
    }
}
public class MyThreadclass{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("Main Method i "+i);
        }
        Myclass m=new Myclass();
        m.start();
    }
}
