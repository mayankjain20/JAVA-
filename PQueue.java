import java.util.PriorityQueue;
import java.util.Scanner;

public class PQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Object> Q =new PriorityQueue<>();
       String  str;
        System.out.println("enter numbers");
        for(int i=1;i<10;i++) {
            System.out.print("");
            str=sc.next();
            Q.add(str);

        }
        System.out.print("this is the first element :");
        // System.out.println(Q.peek());
         System.out.println(Q.poll());


        for(Object i:Q){
            System.out.println(" "+i);
        }

    }
}
