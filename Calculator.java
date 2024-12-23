import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        String str1="java";
        String str2= "Java";
        System.out.println(str1==str2);
        int num=10;
        System.out.println(num++);
        System.out.println("===="+num);
        System.out.println(++num);
        Calculate();
        Calculate();
        Calculate();

    }

    static void Calculate(){
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b =sc.nextInt();
        System.out.println("enter your choice (A for addition,S for substraction,M for multiplecation,D for division): " );
        char ch= sc.next().charAt(0);

        char A,S,M,D;


        if(ch=='A'){
            int add=a+b;
            System.out.println("addition :"+add);
        }
        else if(ch=='S'){
           int sub=a-b;
            System.out.println("Subtraction :"+sub);
        }
        else if(ch=='M'){
            int mul=a*b;
            System.out.println("multiplication :"+mul);
        }else if(ch=='D'){
            float div= a/b;
            System.out.println("division :"+div);
        }
        else{
            System.out.println(" its wrong input  your input must be in A,S,M,D");
        }




    }



}
