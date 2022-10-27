package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        //new ClassA();

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();

        a1.name = "김혜진";

        System.out.println(a1.name);

        a1.callName();
    }



}
