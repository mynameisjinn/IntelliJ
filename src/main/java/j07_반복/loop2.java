package j07_반복;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.println("몇번까지 출력할까요?");
        n=sc.nextInt();

        // 1 2 3 4 5 출력

//        for(int i=1;i<n+1;i++){
//            System.out.print(i+" ");
//        }

        // 5 4 3 2 1 출력
//        for(int i=1;n>0;n--){
//            System.out.print(n-i+" ");
//
//        }

        // 5 4 3 2 1 출력
        for(int i=0;i<n;i++){
            System.out.print(n-i+" ");
        }


    }
}
