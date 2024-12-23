import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is Not prime");
        }
    }

}
