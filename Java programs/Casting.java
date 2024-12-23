import java.util.*;
public class Casting  
{  
public static void main(String args[])  
{  

Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
double d=sc.nextDouble();   
long l = (long)d;  
int i = (int)l;  
System.out.println("Before conversion: "+d);  
System.out.println("After conversion into long type: "+l);  

System.out.println("After conversion into int type: "+i);  
}  
}  
