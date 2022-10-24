package j08_메소드;

import java.util.Scanner;

public class Method2 {
    /*
    별찍기
     */
    public static String getStar() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int selected = 0;
        System.out.print("별의 개수  한번 더 입력 : ");
        n = sc.nextInt();
        System.out.print("만들고 싶은 모양  한번 더 입력 : ");
        selected = sc.nextInt();


        String result1 = "";
        if (selected == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result1 += "*";
                }
                result1 += "\n";
            }
        }else if (selected == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                    result1 += "*";
                }
                result1 += "\n";
            }

        }else if(selected == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 10 - i; j++) {
                    result1 += "*";
                }
                result1 += "\n";
            }
        }
        return result1;
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

            String star = getStar();

            System.out.println("[결과]");
            System.out.println(star);
        }
    }

