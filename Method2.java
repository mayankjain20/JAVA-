import java.util.*;
import java.util.Scanner;
public class Method2 {
    int a=10,b=36;
    int Addition(int a,int b) {
      int   c=a+b;
        return c;
        //System.out.println("sum " + ":"+c);

    }
    void Substraction() {

        System.out.println("subs: " + (a - b));

    }

    void multiplication() {


        System.out.println("multiplication " + (a * b));
    }

    void division() {

        System.out.println("division: " + (a / b));

    }

    public static void main(String[] args) {
        Method2 m=new Method2();
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter A Value");
        a = s.nextInt();
        System.out.println("Enter B Value");
        b = s.nextInt();



        System.out.println("enter your choice press (1 for Addition,2 for substraction,3 for multiplication,4 for division)");
        int ch = s.nextInt();
        if(ch==1){
           int sum= m.Addition(10,25);
            System.out.println((float)sum/2);
        }
        else if(ch==2){
            m.Substraction();

        }
        else if(ch==3){
            m.multiplication();
        }
        else if(ch==4){
            m.division();
        }
        else{
            System.out.println("wrong entry");
        }

    }
}

