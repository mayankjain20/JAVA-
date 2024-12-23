
import java.util.*;
class area{
           public int length,width;
          Scanner an =new Scanner(System.in);
   
public void input(){
           System.out.println("enter the length =");
           length= an.nextInt();
           System.out.println("enter the width");
           width= an.nextInt();  
           int area = 2*(length*width);
           System.out.println("the area of rectangle:"+area); 
         }  
}       
 class Rectangle{
                  public static void main(String[] args){
                   area obj = new area();
                    obj.input();
                  }
}