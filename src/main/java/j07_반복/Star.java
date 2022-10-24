package j07_반복;

public class Star {
    public static void main(String[] args) {
//        for(int i = 0; i <10; i++) {
//            for(int j=0; j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // * 개수 10 -> 9 만들기
        // 내 답
//        for(int i=10; i>0; i--) {
//
//            for(int j=0; j<i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 강사님 답
//        for(int i = 0; i < 10; i++) {
//            for (int j=0; j<10-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i = 0; i < 10; i++) {
////            System.out.print("*");
//
//            for (int j=0; j<10-i; j++){
//
//                System.out.print("*");
//            }
//            System.out.print(" ");
//
//            for (int n=0;n<i+1;n++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
