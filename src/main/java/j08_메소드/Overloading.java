package j08_메소드;

public class Overloading {
    /*
    메소드 오버로딩이란?
    매개변수의 형태가 다르면
    동일한 메소드명을 가질 수 있는 것
     */

    public  static void add() {
        System.out.println("add()");
    }
    public static void add(int a){
        System.out.println("add()");
    }

    public static void main(String[] args) {
        add();
    }
}
