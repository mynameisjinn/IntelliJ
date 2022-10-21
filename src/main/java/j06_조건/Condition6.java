package j06_조건;

import java.util.Scanner;

public class Condition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int score = 0;
       System.out.println("점수를 입력하세요 : ");
       score = sc.nextInt();

       if(score<0||score>100){
           System.out.println("계산 불가");
       }else{
           switch (score/10) {
               case 10:
               case 9:
                   System.out.println("A");
                   break;
               case 8:
                   System.out.println("B");
                   break;
               case 7:
                   System.out.println("C");
                   break;
               case 6:
                   System.out.println("D");
                   break;
               default:
                   System.out.println("F");

           }

       }


    }
}
