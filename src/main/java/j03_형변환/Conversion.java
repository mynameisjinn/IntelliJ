package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // Upcatsting(업캐스팅) : 문자 -> 정수 -> 실수
        char cast1 = 'a';
        System.out.println((int)cast1);

        // Downcasting(다운캐스팅) 실수 -> 정수 -> 문자
        int cast3 = 98;
        char cast4 = (char) cast3;
        System.out.println(cast4);
    }
}
