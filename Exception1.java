public class Exception1 {
     Exception1(int a,int b){
        if(b==0){
            throw new ArithmeticException("division by zero");
        }
       else{
            System.out.println("division"+a/b);
        }
    }

    public static void main(String[] args) {

        new Exception1(3,0);
    }

}
