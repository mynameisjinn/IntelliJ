package j22_람다;

@FunctionalInterface
/*
    람다를 사용하는 경우 어노테이션 해주어야함.
    추상메소드가 2개 이상으로 잡히는 것을 방지해줌!
    ( 다른 사람과 함께 공동개발하는 경우 알려주기 위함 !! )
 */

public interface Operation {
    public int calc(int x, int y);

    // 람다 사용시, default 메소드는 사용가능(1개 이상 존재 할 경우)
    public default String resultToString(int result){
        return "결과 : "+result;
    }
}
