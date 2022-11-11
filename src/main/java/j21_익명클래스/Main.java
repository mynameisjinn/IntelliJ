package j21_익명클래스;

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        // 익명 클래스 생성
        // 일회용임 -> 다른클래스에서는 해당 클래스를 생성할 수 없음
        Interface1 interface6 = new Interface1(){

            @Override
            public void methodName(){
                System.out.println("'익명클래스'로 정의한 메소드");
            }
        }; // 익명 클래스가 정의되는 부분의 마지막

        interface6.methodName();

        Interface1 interface7 = new Interface1(){

            @Override
            public void methodName(){
                System.out.println("'익명클래스'로 정의한 메소드2");
            }
        };

        interface7.methodName();
    }
}
