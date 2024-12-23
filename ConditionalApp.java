import java.util.Scanner;

class ConditionalApp{

    public static void main(String[] args) {

        int a;
        int b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first Number");
        a=s.nextInt();
        System.out.println("enter the second number");
        b=s.nextInt() ;
        System.out.println("enter the third number");
        int c=s.nextInt();

        if(a>b &&a>c){
            System.out.println("a  is greater than b and c .");
        }
        else if(a<b && c<b) {
            System.out.println("b is greater than a and b" );
        }
        else
            System.out.println("c is greater");

    }



}