class Pattern1{
public static void main(String ards[])
{        
              int n=4;
          for (int i=1;i<=n;i++)
          {
          for (int j=n-1;j>=i;j--)
            {
               System.out.println(" ");
            }
            for(int k=i-1;k>=-(i-1);k-- )  
           {
             System.out.println(i-Math.abs(k));
           }
            
                 System.out.println("\n");
         }
}
}  