public class SimpleInterest {
     public static void main(String args[])
     {
           int pa= 33000;
           float rate = 5.5f;
           int time =3;
           float SI ;
           float TA;

           SI =(pa*rate*time)/100;
           System.out.println("your simple interest is:"+SI);
           TA = pa +SI;
           System.out.println("So the total amount is:"+ TA);

     }




}
