import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in) ;
          int mark[]=new int[5];
        for(int i=0;i<mark.length;i++){
            System.out.println("enter your marks "+(i+1));
            mark[i]=ob.nextInt();
        }
        int temp=0;
        for(int i:mark) {
            System.out.println("here is your mark: " + i);
             temp =temp+i;
        }
        System.out.println("Total : "+temp);
        float percentage =(temp/5);
        System.out.println("your result in percentage  :"+percentage);
    }

}
