import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int  n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        int reverse_number=0;
       int temp;
        while(n>0){
            temp = n%10;
            reverse_number=(reverse_number*10)+temp;
            n=n/10;
        }
        System.out.println("revesre of the number  :" +reverse_number);
    }
    }
