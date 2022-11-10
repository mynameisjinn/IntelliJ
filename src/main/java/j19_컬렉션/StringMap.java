package j19_컬렉션;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String,String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

//        System.out.println(list);
//        System.out.println(list.get(3));

        // 값 추가
        map.put("4","김준일");
        map.put("7","이동빈");
        map.put("3","도정민");
        map.put("2","최해혁");
        map.put("8","김준일");

        System.out.println(map);

        // 값 조회 - 키 값으로 검색가능
//        System.out.println(map.get("4"));

        /*
            2 번학생의 이름을 김완준으로 바꾸기
         */

        String searchId = "2";

        // 값 수정 - put 사용
        // 키값은 중복 불가 - 키값이 중복될 경우, 새로운 값으로 덮어 씌워진다.(set의 특징)
        map.put(searchId,"김완준");
        System.out.println(map);

        //  값 수정 - searchId 값 "이성욱"으로 바꾸기
        map.replace(searchId,"이성욱");
        System.out.println(map);

        // 값 삭제 - key 값으로 삭제
        map.remove(searchId);
        System.out.println(map);

        // conatainsKey & containsValue
        boolean searchSuccessflag = map.containsKey(searchId);
        System.out.println(searchSuccessflag);

        searchSuccessflag = map.containsValue("김준이");
        System.out.println(searchSuccessflag);

        // entrySet()
        Set<Map.Entry<String,String>> entry = map.entrySet();
//        entry.iterator().forEachRemaining(e -> {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        });

        List<Map.Entry<String,String>> entries = new ArrayList<Map.Entry<String, String>>();

        entries.addAll(entry);
        System.out.println("entry 리스트 -> "+entries);

        Iterator<Map.Entry<String,String>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // key 값만 가져오기
        Set<String> KeySet = map.keySet();
        System.out.println("keySet >>> " + KeySet);

        // value 값만 가져오기
        Collection<String> values = map.values();
        System.out.println("values >>> " + values);

    }
}
