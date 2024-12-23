import java.util.*;
import java.util.Scanner;
public class Method {

    void Addition(int a,int b) {
       /* int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Value");
        a = s.nextInt();
        System.out.println("Enter B Value");
        b = s.nextInt();*/

        System.out.println("sum " + ":" + (a + b));

    }
    void Substraction(int a,int b) {
       /* int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Value");
        a = s.nextInt();
        System.out.println("Enter B Value");
        b = s.nextInt();*/
        System.out.println("subs: " + (a - b));
    }

     void multiplication(int a,int b) {

       /* int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Value");
        a = s.nextInt();
        System.out.println("Enter B Value");
        b = s.nextInt();*/
        System.out.println("multiplication " + (a * b));
    }

    void division(int a,int b) {
//        int a, b;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter A Value");
//        a = s.nextInt();
//        System.out.println("Enter B Value");
//        b = s.nextInt();
     System.out.println("division: " + (a / b));

    }

    public static void main(String[] args) {
        Method m=new Method();
        Scanner s = new Scanner(System.in);

      ;
        System.out.println("enter your choice press (1 for Addition,2 for substraction,3 for multiplication,4 for division)");
        int ch = s.nextInt();
        if(ch==1){
            m.Addition(10,25);
        }
        else if(ch==2){
            m.Substraction(28,3);

        }
        else if(ch==3){
            m.multiplication(3,4);
        }
        else if(ch==4){
            m.division(8,2);
        }
        else{
            System.out.println("wrong entry");
        }

    }
}
