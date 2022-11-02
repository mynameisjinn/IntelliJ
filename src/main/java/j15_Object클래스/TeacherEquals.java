package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일","코리아");
        Teacher teacher2 = new Teacher("김준일","코리아");

        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2));
    }
}
