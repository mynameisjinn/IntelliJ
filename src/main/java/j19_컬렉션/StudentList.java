package j19_컬렉션;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "HyeJin1"));
        students.add(new Student(20220002, "HyeJin2"));
        students.add(new Student(20220003, "HyeJin3"));
        students.add(new Student(20220004, "HyeJin4"));
        students.add(new Student(20220005, "HyeJin5"));

        // 해당 이름 찾기
        String searchName = "HyeJin2";


        // 해결 1) for each 사용
//        int index = students.indexOf(searchName);
//        for (Student student : students){
//            if (student.getName().equals(searchName)){
//                System.out.println(searchName+" 학생의 학번 : "+student.getId());
//                break;
//            }
//        }
        // 해결 2) for 사용
//        for(int i = 0; i < students.size(); i++){
//            if(students.get(i).getName().equals(searchName)){
//                System.out.println(searchName+" 학생의 학번 : "+students.get(i).getId());
//                break;
//            }
//        }

        // 해당 Id 찾아서 지우고 출력하기
        int searchId = 20220002;

        // indexOf - 문자열만 .. (?)
        for (Student student : students){
            if (student.getId() == searchId){
                System.out.println(searchId+" 학생의 이름 : "+student.getName());
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);

    }
}
