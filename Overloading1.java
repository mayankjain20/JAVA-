import java.util.Scanner;
public class Overloading1 {
    void Addition(int a,int b) {
        System.out.println("The sum of two digit "+(a + b));
    }
    void Addition(int a,int b,int c) {
        System.out.println("The sum of three digit is  :"+(a + b + c));
    }
    void Addition(int a,int b,int c,int d) {
        System.out.println("The sum of four digit is  :"+(a + b + c + d));
    }
    void Addition(int a,int b,int c,int d,int e) {
        System.out.println("The sum of five digit is   :"+(a + b + c + d + e));
    }
    void subtraction(int a, int b) {
        System.out.println("The subtraction of two number is  : " +(a - b) );
    }
    void multiplication(int a,int b){
        System.out.println("The Multiplication of two  number is:"+ a*b);
    }
    void multiplication(int a,int b,int c){
        System.out.println("The Multiplication of three  number is :"+ a*b*c);
    }
    void multiplication(int a,int b,int c,int d){
        System.out.println("The Multiplication of four number is  : "+ a*b*c*d);
    }
    void multiplication(int a,int b,int c,int d,int e){
        System.out.println("The Multiplication of five number is  :"+ a*b*c*d*e);
    }
    void division(int a ,int b){
        System.out.println("The division of two number is   :" +a/b);
    }
    int a, b, c, d;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Overloading1 obj = new Overloading1();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for addition \n2 for subtraction \n3 for multiplication \n4 for division \nEnter your choice:");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("How many number's sum you want :");
            int k = sc.nextInt();
            if (k == 2) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                obj.Addition(a,b);
            }
            else if (k == 3) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter third number");
                int c = sc.nextInt();
                obj.Addition(a,b,c);
            }
            else if (k == 5) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter third number");
                int c = sc.nextInt();
                System.out.println("Enter forth number");
                int d = sc.nextInt();
                System.out.println("Enter forth number");
                int e = sc.nextInt();
                obj.Addition(a,b,c,d,e);
            }
            else if (k == 4) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter third number");
                int c = sc.nextInt();
                System.out.println("Enter forth number");
                int d = sc.nextInt();
                obj.Addition(a,b,c,d);
            }
        }
        else if (ch == 2) {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            obj.subtraction(a,b);
        }
        else if (ch == 3) {
            System.out.println("How many number's sum you want ");
            int k = sc.nextInt();
            if (k == 2) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                obj.multiplication(a,b);
            } else if (k == 3) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter second number");
                int c= sc.nextInt();
                obj.multiplication(a,b,c);
            } else if (k == 4) {
                System.out.println("Enter first number");
                int a = sc.nextInt();

                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter second number");
                int c = sc.nextInt();
                System.out.println("Enter second number");
                int d= sc.nextInt();
                obj.multiplication(a,b,c,d);
            } else if (k == 5) {
                System.out.println("Enter first number");
                int a = sc.nextInt();

                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Enter second number");
                int c = sc.nextInt();
                System.out.println("Enter second number");
                int d= sc.nextInt();
                System.out.println("Enter second number");
                int e= sc.nextInt();
                obj.multiplication(a,b,c,d,e);
            }
        }
        else if(ch==4){
            System.out.println("Enter first number");
            int a= sc.nextInt();
            System.out.println("Enter second number");
            int b= sc.nextInt();
            obj.division(a,b);
        }
        else
        {
            System.out.println("your choice is incorrect ");
        }
    }
}













