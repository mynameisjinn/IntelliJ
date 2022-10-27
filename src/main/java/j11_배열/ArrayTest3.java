package j11_배열;

import java.util.Scanner;
//  인덱스값을 키보드를 통해 입력받기
public class ArrayTest3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        String[] studentNames = null;

        System.out.println("환승연애 출연자 수는 ?");
        count = sc.nextInt();
        sc.nextLine();

        studentNames = new String[count];

        System.out.println();


        for (int i=0;i<studentNames.length; i++){
            System.out.println((i+1)+"번째 출연자 이름 : ");
            studentNames[i] = sc.nextLine();
        }
        System.out.println("[출연자 리스트]");
        for (int i =0; i<studentNames.length;i++){
            System.out.println(studentNames[i]);
        }
        System.out.println("출연자 수는 총 "+ count + "명 입니다.");
    }
}
