
import java.util.Scanner;
 class Cloths {
    int size;
    String colour;
    String Design;
    void Choice() {
        System.out.println("Size is  :"+size);
        System.out.println("Colour is  :"+colour);
        System.out.println("Design is :"+Design);
    }

Cloths(){}
    Cloths(int size, String colour, String Design) {
        this.size = size;
        this.colour = colour;
        this.Design = Design;
    }
}
class Shirt extends Cloths {
    String Type;
    int range;

    Shirt(int size, String colour, String Design, String Type, int range) {
        super(size, colour, Design);
        this.Type = Type;
        this.range = range;
    }

    void Choice() {

        super.Choice();
        System.out.println("This Type is you liked  :" + Type);
        System.out.println("Your range  :" + range);

    }
}
class Pant extends Shirt {
    String company;

    Pant(int size, String colour, String Design, String Type, int range, String company) {
        super(size, colour, Design, Type, range);

        this.company = company;
    }


}




public class Test{

    int size;
    String colour;
    String Design;
    String Type;
    int range;
    String company;
      void setData(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size ");
        size = sc.nextInt();
        System.out.println("Enter colour which you want to liked ");
        colour = sc.next();
        System.out.println("Which design you like");
        Design = sc.next();
        System.out.println("enter the type of shirt");
        Type = sc.next();
        System.out.println("enter  the range ");
        range = sc.nextInt();
          System.out.println("enter  the Company ");
          company = sc.next();

    }

    Test(){}

    public static void main(String[] args) {
        Test t=new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want ");
        String ch = sc.next();

        t.setData();

        if (ch.equals("Shirt")) {
            Shirt obj1= new Shirt(t.size, t.colour, t.Design,t.Type ,t.range);
            obj1.Choice();
        } else if (ch.equals("Pant")) {
            Pant obj1= new Pant(t.size, t.colour, t.Design,t.Type ,t.range,t.company);
            obj1.Choice();
        }
    }
}