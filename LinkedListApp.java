import java.util.*;

public class LinkedListApp {
    public static void main(String[] args) {


        LinkedList<employee2> t  = new LinkedList<>();
        employee2 ss=new employee2(2,"rajan",45);
            t.add(ss);
            ArrayList<Student2> S  = new ArrayList<>();
        Student2 s=new Student2("Mayank", 45, "28/05/2003");
        S.add(s);
        for(Student2 x:S){
            System.out.println(x.toString());
        }
        for(employee2 x:t){
            System.out.println(x);
        }
        for(Student2 x:S){
            System.out.println(S);
        }
        for(employee2 x:t){
            System.out.println(t);
        }

}}