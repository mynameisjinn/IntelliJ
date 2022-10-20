package j05_Scanner;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {

        String name = "김혜진";
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println("입력 받은 값1 : " + s);
        System.out.println("입력 받은 값2 : " + s2);

    }
}

