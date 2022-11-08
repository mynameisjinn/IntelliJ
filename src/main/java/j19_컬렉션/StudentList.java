package j19_컬렉션;

import lombok.AllArgsConstructor;

import java.util.*;

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

//        // 해당 Id 찾아서 지우고 출력하기
//        int searchId = 20220002;
//
//        // indexOf - 문자열만 .. (?)
//        for (Student student : students) {
//            if (student.getId() == searchId) {
//                System.out.println(searchId + " 학생의 이름 : " + student.getName());
//                students.remove(students.indexOf(student));
//                break;
//            }
//        }
//        System.out.println(students);

        /* for each
        id = 20220003 인 학생(HyeJin3)을 찾아서 이름 바꾸기
         */
//
//        int searchId2 = 20220003;
//
//        for (Student student : students) {
//            if (student.getId() == searchId2 && student.getName().equals("HyeJin3")) {
//                student.setName("혜진3");
//                break;
//            }
//        }
//        System.out.println(students);

        /* iterator
        id = 20220004 인 학생(HyeJin4)을 찾아서 이름 바꾸기
         */

//        int searchId3 = 20220004;
//
//        Iterator<Student> iterator = students.iterator();
//
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if(student.getId() == searchId3){
//                student.setName("혜진4");
//
//                // 윗줄과 다른코드임! -> 이해할 것
////                iterator.next().setName("혜진4");
//
//                break;
//            }
//        }
//        System.out.println(students);

        // 배열 역순으로 넣기
        List<Student> reverseStudets = new ArrayList<Student>();
//        System.out.println(reverseStudets);

        // 내 답안
        int j = 0;
        for (int i = 4; i >= 0; i--) {  // 나는 size가 4인걸 알고 지정해주었음
            reverseStudets.add(j, students.get(i));
            j++;
        }
//        System.out.println(reverseStudets);

        // 강사님 답안
        for (int i = 0; i < students.size(); i++) {
            reverseStudets.add(students.get(students.size() - 1 - i));
        }
//        System.out.println(reverseStudets);

        for (Student student : students) {
            reverseStudets.add(0, student);
        }
//        System.out.println(reverseStudets);

        Collections.reverse(reverseStudets);
//        System.out.println(reverseStudets);

        /*
            idList
            nameList
         */

        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

//        System.out.println(idList);
//        System.out.println(nameList);

        // 내 답
        for (int i = 0; i < students.size(); i++) {
            idList.add(i, students.get(i).getId());
            nameList.add(i, students.get(i).getName());
        }
//        System.out.println("idList : " + idList);
//        System.out.println("nameList : " + nameList);

        // 강사님 답
        for (Student student : students) {
            idList.add(student.getId());
            nameList.add(student.getName());
        }

        // students 비우고, idList, nameList 값으로 채워 넣기

        students.clear();
        System.out.println("현재 students 리스트 : " + students);

        for (int i = 0; i < idList.size(); i++) {
//            students.add(i, idList.get(i));  // 이게 안돼는 이유는??
            Student student = new Student(idList.get(i), nameList.get(i));
            students.add(student);
        }
        System.out.print("현재 students 리스트 : ");
        System.out.println(students);
    }
}