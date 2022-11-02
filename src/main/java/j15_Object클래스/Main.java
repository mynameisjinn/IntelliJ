package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        int hashCode = objectTest.hashCode();
        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode));
        // toHexString : 정수 -> 16진수

        System.out.println(objectTest);
        // hash 값 -> 주소값
    }
}
