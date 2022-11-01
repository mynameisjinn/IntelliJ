package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal animal1 = null;
        Animal animal2 = null;

        System.out.println("[ 캐스팅 전 ]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println("[ 캐스팅 ]");
        System.out.println("< upcasting >");
        animal1 = human;
        animal2 = tiger;
        animal1.move(); // 자식클래스에만 있는 메소드는 실행할 수없다(human.readBooks)

        System.out.println("< downcasting >");
        Human d_human = (Human)animal1; // 명시적 형변환 필요 -> 자료형 붙여줄 것!
        d_human.readBooks();

        System.out.println("======================");
        System.out.println();

        Animal a = new Animal();
        Human h = (Human) a; // 잘못된 다운캐스팅
        h.readBooks();
        // 참조 자료형에서는 업캐스팅 된적 있는 메모리만 다운캐스팅이 될 수 있다.
        // (메모리가 생성되어야 하기 때문)
    }
}
