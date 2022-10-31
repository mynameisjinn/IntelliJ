package j12_상속;

public class Human extends Animal{
    @Override // 해당 메소드가 상위 객체로부터 재정의된 메소드임을 표기
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public Human(String name) {
        super(name); // 순서 중요! 제일 처음에 실행되어야 함 !!
        System.out.println("Human 생성");
    }
//    public void runMove(){
//        move();
//    }
}
