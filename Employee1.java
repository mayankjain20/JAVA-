import java.util.Scanner;
public class Employee1 {
    private final String name="Mayank Jain";
    private  int pin=998160;

    int password;
    String User_name;
    public void salary(){


        Scanner cs=new Scanner(System.in);
        System.out.println("put your finger on the scanner");
        System.out.println("User Name:");
        User_name=cs.nextLine();
        if(User_name .equalsIgnoreCase(name)){
            System.out.println("enter password " );
            password =cs.nextInt();
            if(password ==pin){
                System.out.println("your salary is 30000 per month  ");
                System.out.println("THANK YOU");
            }
            else {
                System.out.println("incorrect password");
                System.out.println("TRY AGAIN");
            }
        }
            else{
            System.out.println("its not your User Name ");
            }
        }
        public static void main(String[] args) {
        Employee1 obj =new Employee1();
        obj.salary();
    }
    }


