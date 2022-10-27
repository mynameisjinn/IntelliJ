package j09_클래스;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){
        while(studentYear > 0 && studentYear < 4){
        studentYear += 1;
        System.out.println(name + " 의 현재 학년 : " + studentYear);
        }
        if (studentYear == 4){
            System.out.println("더이상 증가할 수 없습니다.");
        }
    }
    void showStudentInfo(){
        System.out.println("학교 : " + schoolName);
        System.out.println("학번 : " + studentCode);
        System.out.println("학년 : " + studentYear);
        System.out.println("이름 : " + name);
        System.out.println();
    }
}
