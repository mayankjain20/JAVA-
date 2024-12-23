class A {
    int age=45;
    void display() {
        System.out.println(age);
        System.out.println("this is function of A class");
    }
}
class B extends A {

    }
public class polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
