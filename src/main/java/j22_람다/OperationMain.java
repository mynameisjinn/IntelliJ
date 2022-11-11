package j22_람다;

public class OperationMain {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // 익명클래스
        Operation add = new Operation(){
            @Override
            public int calc(int x, int y){
                return x + y;
            }
        };


        int addResult = add.calc(a,b);
        System.out.println("익명 클래스 : "+a+" + "+b+" = "+addResult);

        // 익명클래스 >> 람다식으로 표현
        Operation add2 = (x,y) -> x + y ;
        /*
            원래 람다식의 형태
            Operation add2 = (int x, int y) -> {
                return x + y ;
           };
         */

        /*
           바뀐 것
           ( int x, int y ) >>> (x,y)
           public int calc >>> ->
           { return x + y } >>> x + y ; (구현부에 return 만 있는 경우만 생략가능)
         */

        /*
            람다식의 특징
            구현할 인터페이스(추상 메소드)가 한개만 있어야함
            때문에 생략할 수 있음.(단, default 메소드는 가능)
         */

        int addResult2 = add2.calc(a,b);
        System.out.println("익명 함수 : "+a+" + "+b+" = "+addResult2);

        Operation sub = (int x, int y) -> {
            return x - y;
        };
        System.out.println(sub.calc(b,a));

        // default 메소드 사용
        System.out.println(sub.resultToString(sub.calc(b,a)));

        // multi 로 만들어 보기
        Operation multi = (int x, int y) -> x * y;
        System.out.println(a+" * "+b+" = "+multi.calc(a,b));

        // div 로 만들어보기
        Operation div = (int x, int y) -> x / y;
        System.out.println(a+" / "+b+" = "+div.calc(a,b));

        // 익면 보기


    }
}
