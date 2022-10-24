package j08_메소드;

import java.util.Random;

public class RandomNumber {

    public static int calRandom(int m) {
        Random random = new Random();
        int result = random.nextInt(10)*1000+m;
        return result;
    }

    public static void main(String[] args) {

        int money = 5000;
        calRandom(money);
        System.out.println(calRandom(money));
        /*

        int money = 5000;

        int a = random.nextInt(10)*1000+money;
        System.out.println(a);
        int b = random.nextInt(10)*1000+money;
        System.out.println(b);
        int c = random.nextInt(10)*1000+money;
        System.out.println(c);
        int d = random.nextInt(10)*1000+money;
        System.out.println(d);

        System.out.println(a + b + c + d);
*/


        /*for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(10);
            System.out.println(randNum);
        }*/
    }
}
