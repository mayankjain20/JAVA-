 class Exception4 extends Exception {
    public Exception4(String s ){
        super (s);
    }

}
class Exception2{
    public static void main(String[] args) throws Exception4 {
        int balance=8000 ,expenditure=6000;
        if (balance>expenditure){


            throw new Exception4("balance");

        }
    }
}
