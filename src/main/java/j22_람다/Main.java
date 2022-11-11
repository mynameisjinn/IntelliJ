package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // Runnable - thread 에서 많이 사용
        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable1.run();
        runnable2.run();

        Thread thread1 = new Thread(()->{
            for(int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i = 10; i < 20; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2 : " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();

        // Supplier
        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        // Consumer
        Consumer<String> consumer = (name) -> {
      // 매개변수가 1개일 경우 () 생략 가능! (name) 이 아닌 name 으로 해도 출력 가능
            System.out.println("이름 : " + name);
        };
        consumer.accept("김혜진");

        // Function
        Function<Integer,String> funcion = age -> "나이 : " + age;
        System.out.println(funcion.apply(26));

        // Predicate
        Predicate<Integer> leapMonth = year ->
                year % 4 == 0 && year % 100!= 0 || year % 400 == 0;
        int searchYear = 2022;
        System.out.println(searchYear+"년은 윤달입니까? "+
                leapMonth.test(searchYear));
    }
}
