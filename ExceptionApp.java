public class ExceptionApp {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        try{
            System.out.println(a/b);

        }catch (Exception e){
            System.out.println("B should  Not be Zero");
        }

    finally{
            System.out.println("Close connection Code");
        }
    }
}
