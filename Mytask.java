import java.util.Scanner;

class MyMarks extends Thread {

    public void run(){
        for(int i =1;i<=5;i++){

            //Thread.sleep(1000);
            System.out.println(i);
            throw new RuntimeException();

        }



    }
}
public class Mytask {
    public static void main(String[] args)    {

        Scanner sc=new Scanner(System.in);

        int  arr[] =new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter marks of subject "+i);
            arr[i]=sc.nextInt();
        }

        for(int i:arr){
            System.out.println(i);

        }
        MyMarks obj =new MyMarks();
        obj.start();
    }
}
