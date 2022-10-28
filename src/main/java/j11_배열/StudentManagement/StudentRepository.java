package j11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students;

    public StudentRepository() {
        students = new Student[0];
    }
    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1){
           index = increaseArray();
        }

        students[index] = student;
    }
    private int indexOfEmpty() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return i;
            }
        }return -1;
    }
    private int increaseArray(){
        Student[] tempArray = new Student[students.length+1];
        for(int i=0; i<students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;
        return tempArray.length-1;
    }

    public Student[] getStudent(){
        return students;
    }

    // 학생이름으로 배열에서 찾기 ( -> 학생의 정보(위치) 찾기 )
    // 변수명 name 은 private 로 선언되었기 때문에 접근시 getter() 필요!
    public int findStudentByName(String name){
        for(int i=0; i<students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {
                    return i; // i 번째 인덱스에 해당 이름이 있다!
                }
            }
        }
        return -1; // 찾고자하는 이름이 없다는 뜻!
    }

    // 가져온 학생 외부로 - ?
    public Student getStudent(int index) {
        return students[index];
    }

    // 학생 정보 삭제
    public Student removeStudent(int index) {
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent) {
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }
}
