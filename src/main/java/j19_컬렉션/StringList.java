package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class StringList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
//        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
//        printCollection(list);

        list.add(1,"a");
//        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2,list);
//        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0);
//        System.out.println("str1: " + str1);

        // 값 조회(2) - for each
        for(String str: list){
//            System.out.println("str: " + str);
        }

        // 값 조회(3) - for
        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
        }

        // 값 조회(4) - iterator ( for each 와 흡사함 )
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {          // hasNext() : 다음이 있는지 확인
            System.out.println(iterator.next());
        }

        // 값 수정
        list.set(1,"b");
        printCollection(list);

        // 값 삭제
        list.remove(0);
        printCollection(list);

        for(int i=0; i<list.size(); i++) {
            if (list.get(i).equals("1")) {
                list.remove(i);
                break; // break 를 해줘야 인덱스값이 밀리지않고 지워짐!
            }
        }
        printCollection(list);

        list.add("문자열2");
        list.add("문자열3");
        printCollection(list);

        String searchName = "문자열2";
        // 값 위치 찾기
        int index = list.indexOf(searchName);
        System.out.println("문자열2의 위치 : "+index);


        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 '문자열2'의 위치 : " + lastIndex);

        // 값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열3");
        System.out.println("list에 '문자열3'이 포함되어 있는가? " + isTrue);
        System.out.println();

        // 리스트를 배열로 반환
        Object[] objects = list.toArray();
        System.out.println(objects[0]);
        System.out.println();

        for(Object object : objects){
            System.out.println(object);
        }

    }

    public static void printCollection(Collection collection) {
        System.out.println(collection);
        System.out.println();
    }
}
