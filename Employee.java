import java.util.Scanner;


public class Employee {
    int ID;
    String name;
    String DOB;
    String Employee_position;



Employee(int ID,String name,String DOB,String Employee_position) {
    this.ID = ID;
    this.name = name;
    this.DOB = DOB;
    this.Employee_position = Employee_position;
}
   void  displayData()
   {
       System.out.println(ID +"    "+name+  "     "+DOB+"   "+Employee_position);
   }
    public static void main(String[] args) {

        Employee ds = new Employee(32,"mayank","22/02/1991","clark");
        Employee sd = new Employee(33,"harsh","12/03/1990","manager");
        Employee fa = new Employee(22,"anuj","23/02/2001","worker");
        Employee in = new Employee(20,"daksh","19/04/2003","hr");
        Employee sc = new Employee(23,"montu","3/6/2000","rw");


        System.out.println(" ");
        ds.displayData();
        sd.displayData();
        fa.displayData();
        in.displayData();
        sc.displayData();
}

}
