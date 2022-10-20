package j04_연산자;

public class Operation3 {
    public static void main(String[] args) {
        /*
        윤년은 연도가 4의 배수이면서,
        100의 배수가 아닐 때 또는 400의 배수일 때이다.
         */
        int year1 = 2000;
        int year2 = 2002;

        boolean result1 = false;
        boolean result2 = false;

        result1 = year1%4==0 && year1%100 != 0 || year1%400 == 0;
        result2 = year2%4==0 && year2%100 != 0 || year2%400 == 0;

        if (result1 == true) {
            System.out.println(year1+"년은 윤년입니다");
        }else{
            System.out.println(year1+"년은 윤년이 아닙니다");
        }
        if (result2 == true) {
            System.out.println(year2+"년은 윤년입니다");
        }else{
            System.out.println(year2+"년은 윤년이 아닙니다");
        }

//        System.out.println("2000년은 윤년입니까? : "+result1);
//        System.out.println("2002년은 윤년입니까? : "+result2);
    }
}
