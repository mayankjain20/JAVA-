

class Cars{

    void Feature() {

        System.out.println("colour");
        System.out.println("seats ");
        System.out.println("type of engine");
        System.out.println("some more specification");

    }
}
class Tata extends Cars{

    void Feature(){
        System.out.println("* TATA cars ");
        System.out.println("available colours are white,black and red");
        System.out.println("seats:five and seven");
        System.out.println("");
        System.out.println("With AC");
        System.out.println("Air bags for safety");
        System.out.println("One Year servicing is free of Cost ");
    }
}
class  Suzuki extends Cars {
    void Feature() {
        System.out.println("* Suzuki cars ");
        System.out.println("available colours are white,gray and red ");
        System.out.println("seats:five and seven and nine");
        System.out.println("type of engine");
        System.out.println("With AC");
        System.out.println("air bags for safety");
        System.out.println("");
    }
}
class MG_Hactors extends Cars{


    void Feature() {

        System.out.println(" * MG cars ");
        System.out.println("available colours are white,gray,Black and Brown ");
        System.out.println("seats:five and seven ");
        System.out.println("Engine of the car petrol and diesel ");
        System.out.println("With AC");
        System.out.println("air bags for safety");
        System.out.println("internet inside,camera security with some expensive features ");

    }
}

public class Cars_Details {
     void Show_Details(Cars C){
        C.Feature();
    }

    public static void main(String[] args) {

         Cars T=new Tata();
         Cars S =new Suzuki();
         Cars M =new MG_Hactors();

        Cars_Details obj = new Cars_Details();
        obj.Show_Details(T);
        obj.Show_Details(S);
        obj.Show_Details(M);
    }
}
