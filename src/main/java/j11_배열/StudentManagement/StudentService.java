package j11_배열.StudentManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentService {

    private Scanner scanner;

    private StudentRepository studentRepository;

    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }
    public void registerStudent(){
        String name;
        int kor;
        int eng;
        int math;
        System.out.println("[학생정보 등록]");
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, kor, eng, math);

        studentRepository.addStudent(student);
    }
    public void showStudents(){
        Student[] students = studentRepository.getStudent();

        for(int i = 0; i < students.length; i++){
            Student student = students[i];
            if(student != null){
                student.showStudentInfo();
            }
//            student.showStudentInfo();
        }
    }
    private int indexOf(){
        String name;
        System.out.println("이름을 입력하세요 : ");
        name = scanner.nextLine();

        int index = studentRepository.findStudentByName(name);

        return studentRepository.findStudentByName(name);
    }

    public void showStudent(){

        System.out.println("[ 학생 정보 조회 ]");
        int index = indexOf();

        if(index == -1){
            System.out.println("입력한 이름의 학생의 등록정보가 없습니다.");
            return; // if 문에 해당될 경우 해당 메소드 탈출
        }
        studentRepository.getStudent(index).showStudentInfo();
        System.out.println("조회 완료!");
        System.out.println();
    }


    public void deleteStudent(){
        System.out.println("[ 학생 정보 삭제 ]");
        int index = indexOf();

        if(index == -1){
            System.out.println("입력한 이름의 학생의 등록정보가 없습니다.");
            return; // if 문에 해당될 경우 해당 메소드 탈출
        }
        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제 완료!");
        System.out.println();
    }

    public void modifyStudent(){
        System.out.println("[ 학생 정보 수정 ]");
        int index = indexOf();
        int kor;
        int eng;
        int math;

        if(index == -1){
            System.out.println("입력한 이름의 학생의 등록정보가 없습니다.");
            return; // if 문에 해당될 경우 해당 메소드 탈출
        }

        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student updateStudent = new Student(null, kor, eng, math);

        studentRepository.updateStudent(index, updateStudent);
        System.out.println("수정 완료!");
        System.out.println();

    }
}
