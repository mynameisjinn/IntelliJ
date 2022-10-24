package j08_메소드;

import java.util.Scanner;

public class Method2_a {
    /*
    별찍기
     */
    public static String getStar(int selected, int n) {

        String result = "";
        if (selected == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if (selected == 2) {

        }else if(selected == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 10 - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if(selected == 4) {

        }else{
            System.out.println("입력 오류!");
        }
        return result;
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            // 입력
            int n = 0;
            int selected = 0;
            System.out.print("별의 개수 입력 : ");
            n = scanner.nextInt();

            System.out.println("1.왼쪽으로 치우쳐 증가하는 별");
            System.out.println("2.오른쪽으로 치우쳐 증가하는 별");
            System.out.println("3.왼쪽으로 치우쳐 감소하는 별");
            System.out.println("4.오른쪽으로 치우쳐 감소하는 별");
            selected = scanner.nextInt();

            String star = getStar(selected,n);

            System.out.println("[결과]");
            System.out.println(star);
        }
    }

