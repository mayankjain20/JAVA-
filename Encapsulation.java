import java.util.Scanner;
 class Machine {

      private String Pin ="Ohdude@123" ;
     long money;
     private String  name ="Mayank Jain";

    public void ATM(){
         Scanner sc=new Scanner(System.in);
        System.out.println("insert your card ");
        System.out.println("User Name  ");
       String  user_name =sc.nextLine();
       if(user_name .equalsIgnoreCase(name)){
           System.out.println("enter your password :");
           String  Password=sc.nextLine();
           if(Password .equalsIgnoreCase(Pin)) {

               System.out.println("how much money you want to credit");
               money = sc.nextInt();
               System.out.println("THANK YOU");
           }
               else {
               System.out.println("incorrect passsword");
           }
       }

            else {
           System.out.println("incorrect Username");
       }




       }

    }
public class Encapsulation{
    public static void main(String[] args) {
        Machine obj=new Machine();
        obj.ATM();

    }



}

