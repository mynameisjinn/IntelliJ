package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "혜진";
        String name2 = "혜진";
        String name3 = new String("혜진"); // new 라는 예약어를 사용하는 순간, 새로운 메모리 할당
        String name4 = new String("혜진");

        System.out.println(name1+","+name2+","+name3);
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);
        System.out.println(name1.equals(name3));

    }
}
