package j11_배열;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        10 명의 학생이름을 담을 수 있는 studentNames 배열을 만든다.
         */

        String [] studentNames = new String [10];
        studentNames[0] = "정빈";
        studentNames[1] = "김규민";
        studentNames[2] = "박경효";
        studentNames[3] = "김혜진";
        studentNames[4] = "김지향";
        studentNames[5] = "전병욱";
        studentNames[6] = "윤도영";
        studentNames[7] = "이성욱";
        studentNames[8] = "홍성욱";
        studentNames[9] = "박민화";

        System.out.println("[출력결과");
        int j=1;
        for (int i=0;i< studentNames.length; i++){
            System.out.print(j+". ");
            j++;
            System.out.println(studentNames[i]);
        }
    }
}
