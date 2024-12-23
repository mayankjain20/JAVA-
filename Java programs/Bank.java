public class Demo extends Exception{
  public  Demo(String s){
    super(s);
}
}
  class Bank{
   public static void main(String args)throws Demo{
        
         int balance=9000,expenditure=7000;

       if(balance>expenditure){
      Demo d=new Demo("balance");
   throw d;
    }
}

}