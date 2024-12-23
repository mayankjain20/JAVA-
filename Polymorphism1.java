 class RBIBank {
    void getInterest() {
        System.out.println("Interest Rate is :" + 6.25 + "%");
    }
}
class SBI extends RBIBank{
     void getInterest(){
         System.out.println("Interest Rate is :"+7.50+"%");
     }
}
class HDFC extends RBIBank{
    void getInterest(){
        System.out.println("Interest Rate is :"+6.50+"%");
    }
}
class CBI extends RBIBank{
    void getInterest(){
        System.out.println("Interest Rate is :"+7.25+"%");
    }
}
class PNB extends RBIBank{
    void getInterest(){
        System.out.println("Interest Rate is :"+6.80+"%");
    }
}class Kotak extends RBIBank{
    void getInterest(){
        System.out.println("Interest Rate is :"+7.80+"%");
    }
}
public class Polymorphism1 {

    void gPay(RBIBank r){
        r.getInterest();
    }


    public static void main(String[] args) {
        RBIBank R = new SBI();
        RBIBank P=new PNB();
        Kotak k=new Kotak();
        Polymorphism1 p=new Polymorphism1();
        p.gPay(R);
        p.gPay(P);
        p.gPay(k);
    }


}