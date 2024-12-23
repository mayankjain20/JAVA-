
import java.util.Scanner;
public class ArrayApp {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String student_name=sc.nextLine();
        System.out.println("Enter Your Father's Name:");
        String fathers_name=sc.nextLine();
        System.out.println("Enter Your Mother's Name:");
        String mothers_name=sc.nextLine();
        System.out.println("Which Class You Study:");
        int cla=sc.nextInt();

        String name[] = new String[5];
        name[0] = "Chemistry       ";
        name[1] = "Math            ";
        name[2] = "Physics         ";
        name[3] = "Computer science";
        name[4] = "English         ";
        int marks[] = new int[5];
        for(int i=0;i<marks.length;i++) {
            System.out.println("marks of "+name[i]);
            marks[i] = sc.nextInt();
        }
        System.out.println("__________________________________________________");

        System.out.println("Student name  :"+student_name);
        System.out.println("     ");
         System.out.print( "Father's name  :"+fathers_name);
        System.out.print("     ");
        System.out.println("Mother's name :"+mothers_name);
        System.out.println("     ");
        System.out.println("Class         :"+cla);
        System.out.println("  ");

        int temp=0;
        int j=0;
        for (int i : marks) {
            System.out.println("* "+name[j]+" "+i);
            j++;
            System.out.println("  ");
            temp=temp+i;
        }
        System.out.print("Total : "+temp);
        System.out.print("      ");
        float percentage =(temp/5);
        System.out.println("your result in percentage  :"+percentage);
    }
}
