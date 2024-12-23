public class Human {

    String name;
    String blood_group;
    double height;
    double weight;


    Human(String name,String blood_group,double height,double weight){
        this.name=name;
        this.blood_group=blood_group;
        this.height=height;
        this.weight=weight;


    }

    void getData(){

        System.out.println(name +"           "+"        "+blood_group +"            " +height+"     "+weight);


    }

    public static void main(String[] args) {
        System.out.println("name" +"           "+"        "+"blood_group" +"            " +"height"+"     "+"weight");
         Human obj=new Human("mayank","B+",63.6,52);

        Human vh=new Human ("lakshy","O+",53.4,74);
        Human fd=new Human ("nanu","A-",43.2,67);
        Human er=new Human ("yahuu","AB+",42.3,53);

         obj.getData();
         fd.getData();
         er.getData();
         vh.getData();




    }
}
