package j09_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "김혜진";

        s1.showStudentInfo();
        s1.increaseStudentYear();
        s1.increaseStudentYear();
        s1.increaseStudentYear();
        s1.increaseStudentYear();
        s1.increaseStudentYear();
    }
}
