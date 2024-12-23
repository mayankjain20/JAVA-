public class Total {
    int sum;
    int even;

    public static void main(String[] args) {
        Total  obj= new Total();
       int sum= obj.getTotal(12,38);
        System.out.println("sum "+sum);
        boolean isEven= obj.isEven(7);
        System.out.println(isEven);

    }
    int getTotal(int a ,int b){

        sum =a+b;
    return sum;
    }
    boolean isEven(int a){
        if( a%2==0){
            return true;
        }
        else{
            return false;
        }

    }
}

