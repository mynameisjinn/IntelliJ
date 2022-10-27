package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor c1 = new Constructor();

        c1.num = 1;
        c1.name = "혜진";
        c1.showInfo();

        Constructor c2 = new Constructor(2, "경섭");
        c2.showInfo();



    }
}
