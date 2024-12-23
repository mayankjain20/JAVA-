 class SBIPrivate {
 private int balance=3200;
 protected int  age =32;

    public  void ShowBalance(){

     System.out.println("balance :"+balance);

    }
}
public class User{
 public static void main(String[] args) {
  SBIPrivate obj=new SBIPrivate();
  obj.ShowBalance();
     System.out.println(obj.age);
 }
}
