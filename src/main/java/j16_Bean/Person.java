package j16_Bean;

public class Person {
    private final String name;
    private int age;

    // NoArgsConstructor
    // -> RequiredArgsConstructor와 함께 쓰일 수 없음
//    public Person(){}

    // requiredArgsConstructor (final 로 선언되었기 때문)
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age) {
    // AllArgsConstructor
        this.name = name;
        this.age = age;
    }
}
