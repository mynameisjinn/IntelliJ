package j07_반복;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       boolean isEmpty = true;

       while(isEmpty){
            System.out.print("숫자를 입력하세요: ");
            int num = sc.nextInt();

            if(num != 0){
                isEmpty = false;
            }
        }


    }
}
