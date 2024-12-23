public class Student2 {
    String DOB;
    int roll_no;
    String name;
    Student2(String name,int roll_no,String DOB){
        this.DOB=DOB;
        this.roll_no = roll_no ;
        this.name= name ;
    }


    public String toString() {
        return name + "     " + roll_no + "     " + DOB;

    }

    public static void main(String[] args) {
        Student2 obj=new Student2("30/02/2003",45,"mayank ");
        System.out.println(obj);
    }





}
