package j23_예외;

public class Exception2 {
    public static void printArray(int[] numbers){
        try {
            for (int i = 0; i < numbers.length + 1; i++) {
                System.out.println("/" + numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException 오륙 해결");
            //  프로그램을 정상종료 시키고, 어떤오류가있는지 알려줌
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        printArray(new int[]{1,2,3,4,5,6,7});

        System.out.println("program is end successfully");
    }
}
