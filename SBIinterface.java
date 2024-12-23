interface Reserve {

    void getBalance();
    void Accountopening();
    }

    interface Govt{
    void Loan();
    void finance();
    }

 class SBIinterface implements Reserve,Govt{
   public void getBalance(){
       int a=500;

        System.out.println("your balance is "+a);
    }
    @Override
     public void Accountopening() {
         System.out.println("if you want to open your account oyu want to submit some documents ");

     }

     public void Loan(){
         System.out.println("apply for Loan:");

     }
     public void finance(){
         System.out.println("you want pay (finance installment) on time " );
     }


     public static void main(String[] args) {
       Reserve sc=new SBIinterface();
        sc.getBalance();
        sc.Accountopening();
        Govt cs=new SBIinterface();
        cs.Loan();
        cs.finance();
    }
}
