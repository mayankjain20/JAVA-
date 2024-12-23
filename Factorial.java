import java.util.Scanner;
public class Factorial {
     public static void main(String args[]) {
         Scanner d = new Scanner(System.in);
         System.out.println("enter a number");
         int n= d.nextInt();
         int temp =1;
         for(int i=n;i>=1;i--){
             temp =temp*i;
         }
         System.out.println("the factorial of the given number "+temp);
     }
}


