public class Student
{
    int roll_no;
    String name;
    String fathers_name;
    String Mothers_name;
    int standard;
    String mo_no;
    Student(int roll_no,String name, String fathers_name, String Mothers_name,int standard ,String mo_no){
        this.roll_no=roll_no;
        this.name=name;
        this.fathers_name=fathers_name;
        this.Mothers_name=Mothers_name;
        this.standard=standard;
        this.mo_no=mo_no;



    }
    void Display(){
        System.out.println(roll_no +"           " +name+"              "+fathers_name+"        "+ Mothers_name+"           "+standard+"          "+mo_no);
    }

    public static void main(String[] args) {
        System.out.println("ROLL NUMBER"+"        "+"NAME"+"       "+"FATHER'S NAME"+"       "+"MOTHER'S NAME"+"       "+"CLASS"+"            "+"MO_NUMBER");
        Student obj=new Student(01,"sourabh modi","santosh modi","sindhu modi",12,"9993213675");
        Student obj1=new Student(02,"ramkumar ","  makesh ","     madhu",      12,"7368493932");

        Student obj2=new Student(03,"laksh","      praveen","      sunita",    12,"9354627840");
        Student obj3=new Student(04,"daksh","      neeraj","       anjana",12,"3534364789");
        Student obj4=new Student(05,"rohit ","     rakesh","        anita",12,"6372638300");
        Student obj5=new Student(06,"harsh","      jasbant","       sunita",12,"93635343432");


        obj.Display();
        obj1.Display();
        obj2.Display();
        obj3.Display();
        obj4.Display();
        obj5.Display();
    }







}
