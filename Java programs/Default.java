import java.io.*;
class defaultConstractor{
      int a;
      double d;
      String s;
      float f;
    defaultConstractor()
     {
         System.out.println("To define the default constractor ");
     }
}
     class Default{
                public static void main (String[] args){
                defaultConstractor value =new defaultConstractor();
             
               System.out.println(value.a);
               System.out.println(value.d);
               System.out.println(value.s);
               System.out.println(value.f);
             }           


}
                         
            