import java.util.Scanner;
public class ArrayInReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];
        for(int i=0;i<number.length;i++) {
            System.out.println("enter your marks"+(i+1));
            number[i] = sc.nextInt();
        }
        System.out.println("all numbers are in reverse order::");
        for (int i = number.length-1; i >=0; i--) {
            System.out.println(number[i]);


        }


    }
}
