package j23_예외;

public class Exception1 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};

        // Error 발생 코드
        for(int i = 0; i < 8; i ++) {
            System.out.println(numbers[i]);
        }

        // ArrayIndexOutOfBoundsException 을 처리하는 try catch 구문
        try {
            for(int i = 0; i < 8; i ++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }

        // NullpointerException 이 발생하는 구문
        try {
            String a = null;
            a.toLowerCase();

            for(int i = 0; i < 8; i ++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }

        // NullPointerException && ArrayIndexOutOfBoundsException 모두 처리
        try {
            String a = null;
            a.toLowerCase();

            for(int i = 0; i < 8; i ++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch ( NullPointerException e ) {
            System.out.println("null pointer to exception");
        }
        System.out.println("프로그램 정상 종료");

        // finally
        try {
            String a = null;
            a.toLowerCase();

            for(int i = 0; i < 8; i ++) {
                System.out.println(numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외를 처리하였습니다.");
        }catch ( NullPointerException e ) {
            System.out.println("null pointer to exception");
        }finally {
            System.out.println("항상 실생되어야하는 서비스");
        }
        System.out.println("프로그램 정상 종료");
    }
}
