package j13_추상화.인터페이스;

/*
기본적으로 모든 메소드가 추상메소드로 정의됨
일반 메소드를 정의하기 위해서는 default 키워드를 사용
생성자 정의는 불가능
일반 변수 선언 불가능
상수 선언 가능
 */

public interface Press {
    public final String NAME = "button"; // [ 상수 선언, 초기화 ]

        public void onPressed();

//        public Switch(){     [ 생성자 ]
//
//        }

//        private String name;   [ 변수선언 ]
//        public default void pop(){ [ 일반 메소드]
//
//    }
}

