package j07_반복;

public class loop4 {
    public static void main(String[] args) {

        int n = 5;

        System.out.println("for문 실행");
        for(int i =0; i<n; i++){
            System.out.print(i+1 + " ");
        }
        int i = 0;
        System.out.println(" ");
        System.out.println("while문 실행");
        while (i < n) {
            System.out.print(i+1 + " ");
            i++;
        }


    }
}
