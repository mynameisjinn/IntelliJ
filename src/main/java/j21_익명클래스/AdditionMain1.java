package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {
        // 인터페이스는 생성할 수없다 ! -> implements 해주어야함
//        Addition<String> stringAddition = new Addition<String>();

        Addition<String> stringAddition = new AdditionImpl<String>();
        String str = stringAddition.add("문자열");
        System.out.println(str);

        // implements 의 목적 - 재정의를 하기 위함
        // override 하는 이유도 마찬가지 ! ( 재정의 )


        Addition<Integer> integerAddition = new AdditionImpl<Integer>(){

            // 객체를 생성하고, 클래스는 없지만 오버라이드를 통해 재사용 함
            // 하지만 한번 사용 하고 버릴 것 (일회용임)!

            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
