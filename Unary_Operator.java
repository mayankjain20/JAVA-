import java.util.Scanner;

public class Unary_Operator {
    public static int index=5;
    public static void main(String[] args) {
        int x=10;


        System.out.println(x++);
        System.out.println(x);

        System.out.println(++x);

        System.out.println(x--);
        System.out.println(x);

        System.out.println(--x);
        System.out.println("-----------------------------");
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number to find the table of number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);

        }

        System.out.println("=====================================");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("=====================================");
        for(int index=0;index<=5;index++)
            System.out.println("index is :"+index);
        for(int index=0;index<5;index++){
            System.out.println("index is:" +index);
            index++;
        }

    }



}


