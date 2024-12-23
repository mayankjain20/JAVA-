import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
         System.out.println(" which digit's table you want to print ,pls enter");
          int n = o.nextInt();
         int j=1;
        do {
            System.out.println(j * n);
            j = j + 1;
        } while (j <= 10);
    }
}
