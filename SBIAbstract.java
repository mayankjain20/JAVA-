abstract class RBI{
    abstract void getBalance();

    void AccountOpen(){
        System.out.println("Account Open");
    }

    abstract void deposit();
}
class SBIAbstract extends RBI {
    void getBalance(){
        int Balance =300;
        System.out.println("now your balance is :"+Balance);
    }
     void deposit(){
        int rs =100;
            System.out.println("you deposit in your account :"+rs );

        }

    public static void main(String[] args) {
        SBIAbstract sc=new SBIAbstract();
        sc.deposit();
        sc.getBalance();


    }




    }


