import java.util.Scanner;
public class EMI {
    int PA, T;
    float SimpleInterestWithEMI() {
        float R,SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount:");
        PA =sc.nextInt();
        System.out.println("enter the rate of interest");
        R= sc.nextFloat();
        System.out.println("Enter period of time");
        T =sc.nextInt();
        SI =(PA*R*T)/100;
        return SI;

    }
    public static void main(String[] args) {
            EMI obj=new EMI();

            float si=obj.SimpleInterestWithEMI();
            System.out.println("simpleinterest is:" +
                    ""+si);
                   float total =si +obj.PA;

            float  emi= total/(obj.T*12);
            System.out.println("Your EMI is :"+emi);


    }
}