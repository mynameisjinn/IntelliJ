package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

    // 생성자 - 클래스명과 일치해야하며 반환자료형이 없음
    ClassA(){
        System.out.println("ClassA를 생성합니다.");
    } // 클래스가 만들어질때마다 호출됨
    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }
}
