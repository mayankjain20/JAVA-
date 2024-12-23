 import java.util.*;  

class Area{
          
          public static void main (String[] args){
        int r ;
        double area;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        r= sc.nextInt();
        area= 2*(3.14)*r;

        
        System.out.println("the area of circle is: " + area +"unit" );
       
}
}