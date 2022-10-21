package j07_반복;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int dan = 0;
//
//        System.out.println("계산할 구구단 입력 : ");
//        dan = sc.nextInt();

//        for(int i = 0; i < 9; i++) {
//            int num = i + 1;
//            System.out.println(dan + "x" +num + "="+(dan * num));
//        }

        // 2~9 단까지 출력

        for(int n = 2; n < 9; n++) {
            for(int m = 0; m < 9; m++) {
                int num = m + 1;
                System.out.println(n + "x" +num + "="+(n * num));
            }
        }



    }
}
