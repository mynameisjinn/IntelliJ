package j11_배열;

public class ArrayTest1 {
    public static void main(String[] args) {
        int [] numArray = new int[10];

//        numArray[0] = 10;

        int index = 0;
        numArray[index] = 10;

        for(int i = 0; i<10; i++) {
            System.out.println(numArray[i]);
        }
    }
}
