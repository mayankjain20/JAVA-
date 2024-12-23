import java.util.Scanner;

public class Overloading {
    int a, b, c,d;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();
        System.out.println("enter forth number");
        int d=sc.nextInt();
        System.out.println("enter fifth number");
        int e=sc.nextInt();
        Overloading obj=new Overloading(a,b,c);
        Overloading ob=new Overloading(a,b,c,d);
        obj.Addition(a,b);
        obj.Addition(a,b,c);
        obj.Addition(a,b,c,d,e);
    }
    void Addition( int a,int  b){
        System.out.println(a+b);
    }
           void Addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void Addition(double a,int b,int c) {
        System.out.println(a + b + c);
    }
    Overloading(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println(a+b+c);
    }
    Overloading(int a,int b,int c,int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println(a + b + c+d);
    }
    void Addition(int a,int b,int c,int d, int e ){
        System.out.println(a+b+c+d+e);}
}
