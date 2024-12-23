import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {


        Scanner o = new Scanner(System.in);
        System.out.println(" pls enter number");
        int n = o.nextInt();

        int sum = 0;
        int temp;
        temp= n;
        while (n>0)
        {
            int r =n%10;
            sum =sum +r*r*r;
            n=n/10;
        }

        if(temp==sum) {
            System.out.println("this number is armstrong number");
        }
        else {
            System.out.println("it is not a armstrong  number");
        }
    }
}