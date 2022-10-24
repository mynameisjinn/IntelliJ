package j08_메소드;

/*
    메소드란 ? 함수이다.
    함수란 ? 일련의 동작을 묶어 정의한 것.
    특징 : 입력과 출력을 가질 수 있음 (필수는 아님)
    그러면 왜 메소드라고 부르는가?

    클래스 안에 함수를 정의하면 메소드라고 부른다.
    함수를 실행하는 것을 호출(call)이라고 칭한다.


    [객체지향 언어만 메소드 특징을 가진다
    프로그램은 클래스 로딩방식으로 운영이된다.
    클래스가 꼭 있어야하는 건아니지만 java에선 꼭 필요하고,
    이를 메소드라고 부른다. ] -?

*/

public class Method1 {

    // 1. [x | x] 입력 (매개변수), 출력(반환)
    public  static void call1(){
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ] 입력은 있고, 출력은 없는 경우
    public  static void call2(String str){
        System.out.println("[ o | x ]");
        System.out.println("수업 과목 : "+str);
    }

    // 3. [ x | 0 ] 매개변수 없고, 출력은 있는 경우
    public  static String call3() {
        System.out.println("[ x | 0 ]");
        String result = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    // 4. [ o | o ] 매개 변수도 받고, 출력값도 있는 경우
    public static String call4(int year, int month, int day){
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + day +"일";
    }

    // Main method
    public static void main(String[] args) {
        call1();
        call2("Java");
        String star1 = call3();
        System.out.println(star1);
        String date = call4(2022,10,24);
        System.out.println(date);
    }
}
