

public class Data{
    int  age;
    String name;
    String address;
    int reg_num;
    String PAN_Num;

    Data(int age,String name,String address,int reg_num,String PAN_Num){
       this.age=age;
       this.name=name;
       this.address=address;
       this.reg_num=reg_num;
       this.PAN_Num=PAN_Num;

    }

    void getData()
    {

        System.out.println( age + "       "+name +"          "+address+"         "+reg_num+"        "+PAN_Num);
    }

    public static void main(String[] args) {

        Data obj=new Data(12,"mayank","khimlasa",  35472,"CDGX23146");
        Data un=new Data(12,"Raju",   "Khurai",    54633,"GAFS35474");
        Data kl =new Data(23,"Harsh",  "sagar",     53644,"DSEH54637");
        Data op=new Data(34,"raj", "  moradabad",  64532,"GFAD84732");
        Data sc=new Data(34,"nathji","rampur",    86789,"SJAR53421");



        System.out.println("age        name        Address__RegistrationNumber_PAN_Num");

        obj.getData();
        un.getData();
        kl.getData();
        op.getData();
        sc.getData();



    }
}
