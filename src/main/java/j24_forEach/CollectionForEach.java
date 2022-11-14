package j24_forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김혜진");   list.add("김경민");
        list.add("김준일");   list.add("이종준");
        list.add("이동빈");

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println();

        list.forEach(name -> {
            System.out.println(name);
        });

        System.out.println();

        Consumer<String> consumer = name -> {
            System.out.println(name);
        };

        for(String name : Objects.requireNonNull(list)) {
            consumer.accept("김혜진");
        }

    }
}
