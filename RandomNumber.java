import java.util.Random;
public class RandomNumber{
    public static void main(String[] args) {
        Random number=new Random();
        int a= number.nextInt(20);
        System.out.println(a);
        System.out.println("1 number  "+Math.random());
        System.out.println("2 number  "+Math.random());
        System.out.println("3 number  "+Math.random());
        System.out.println("4 number  "+Math.random());


    }



}
