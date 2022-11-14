//package j23_예외;
//
//public class Exception2_re {
//
//    public static void printArray(int[] numbers) throws Exception {
//
//        for (int i = 0; i < numbers.length + 1; i++){
//            System.out.println("/" + numbers[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        /*
//            throw
//             -> 예외를 강제로 생성
//         */
//        throw new RuntimeException("예외 강제 생성");
//
//
//        try {
//            printArray(new int[] {1,2,3,4,5});
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("프로그램 정상 종료");
//
//        if(1 == 1) {
//            try {
//                throw new RuntimeException("예외 강제 생성");
//            } catch (RuntimeException e) {
//                System.out.println("런타임 예외 처리");
//            } finally {
//                System.out.println("예외가 발생 하든 않든 실행");
//            }
//        }
//        System.out.println("프로");
//    }
//
//
//}
