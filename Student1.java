
class Human1 {
    String name;
    int age;
    void print(){
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
    }

    Human1(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Student1 extends Human1  {
    String course_name ;
    String institute_name ;
    int Student_roll_no;
    Student1(String name,int age,String course_name,String institute_name,int Student_roll_no){
    super(name,age);
    this.course_name=course_name;
    this.institute_name=institute_name;
    this.Student_roll_no=Student_roll_no;
    }
@Override
void print(){
    super.print();
    System.out.println("Course Name"+course_name);
    System.out.println("Institute Name:"+institute_name);
    System.out.println("Student Roll No:"+Student_roll_no);
}
    public static void main(String[] args) {
        Student1 s=new Student1("Ram",21,"c/c++","IIT",12);
        s.print();
        Student1 a=new Student1("mayank ",20,"java/c++","TMU",123);
        a.print();
    }
}
