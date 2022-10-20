package j05_Scanner;

import java.util.Scanner;

public class input3 {

    /*
        이름 : 김혜진            name
        나이 : 26               age
        주소 : 부산 연제구        address
        연락처 : 010 1234 5678   phone

        사용자의 이름은 김혜진이고 나이는 26입니다.
        주소는 부산 연제구이며 연락처는 010 1234 5678 입니다.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.println("이름 : ");
        name = sc.next();

        System.out.println("나이 : ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("주소 : ");

        address = sc.nextLine();

        System.out.println("연락처 : ");
        phone = sc.nextLine();

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age+"입니다.");
        System.out.println("주소는 "+address+"이며 연락처는 "+phone+"입니다.");



    }
}
