package j16_Bean;

public class Person {
    private final String name;
    private int age;

    // RequiredArgsConstructor
    public Person(String name) {
        this.name = name;
    }

    // AllArgsConstructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // NoArgsConstructor
//    public Person(){};  -> 사용할 수 없음


}
