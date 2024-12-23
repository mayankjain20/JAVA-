import java.util.Scanner;
public class employee2 {
    int id;
    String name;
    int age;

    employee2(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;

    }


    public String toString() {
        return id + "     " + name + "     " + age;
    }
}
