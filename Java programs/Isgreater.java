import java.util.*;
public class Isgreater
{
  public static void main (String[] args)
{
  Scanner sd=new Scanner(System.in);
  System.out.println("enter any three number");
   int a=sd.nextInt();
   int b=sd.nextInt();
   int c=sd.nextInt();

  if(a>b && a>c)

     System.out.println("a is greater.");

  else if(b>c)

     System.out.println("b is greater.");

  else

     System.out.println("c is greater.");
}
}





