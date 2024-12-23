 import java.util.*;  

class Arthmetic{
          
          public static void main (String[] args){
        



        Scanner sc=new Scanner(System.in);
        System.out.println("enter first  number");
        int a=sc.nextInt();
      
        System.out.println("enter second number");
        int b=sc.nextInt();
        
        System.out.println("enter your choeise( 1 for sum ,2 for sub,3 for mul ,4 for div)");
        int  s= sc.nextInt();
        
     
      switch(s)
           {
       case 1:
                 int sum=a+b;


        System.out.println("sum of two number= "+sum );
          break;
      case 2:
                    int sub=a-b;

        System.out.println("sum of two number= "+sub );
      break;
        case 3:
                    int mul=a*b;

         System.out.println("sum of two number= "+mul );
          break;

        case 4:
                    int div=a/b;

         
          System.out.println("sum of two number= "+div );
        break;
}
} 
}