
import java.util.LinkedHashSet;


public class Sets {


        public static void main(String[] args) {
            LinkedHashSet<Object> l  = new LinkedHashSet<>();
            //HashSet<Object> l  = new HashSet<>();
            int a=4;
            int b=9;
            System.out.println(l.size());
            l.add("daksh");
            l.add("daksh");
            l.add(110);
            l.add("mudit");
            l.add(a==b);
            l.add("hello");
            l.add(67.8);
            l.add("Maynk");
      /*  t.add("daksh");
        t.add("110");
        t.add("mudit");
        t.add("mudit");
        t.add("hello");
        t.add(78.76);*/
            for(Object i:l){
                System.out.println(i);
            }



        }}

