import java.util.Scanner;
public class Ractangular{
    public static void main(String[] args) {
      Scanner ac= new Scanner(System.in);

      int r=ac.nextInt();
      int c=ac.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
