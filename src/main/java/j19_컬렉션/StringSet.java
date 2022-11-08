package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

    public static void main(String[] args) {

        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("혜진0");
        strList.add("혜진1");
        strList.add("혜진2");
        strList.add("혜진3");
        strList.add("혜진4");

//        System.out.println(strList);

        // 값 추가
        strSet.add("혜진5");
        strSet.add("혜진6");
        strSet.add("혜진7");
        strSet.add("혜진8");
        strSet.add("혜진9");

        // Hash 에는 순서가 없다!
//        System.out.println(strSet);

        strSet.addAll(strList);
        // list 엔 순서가 있지만 HashSet 에 들어간 순간 순서없어짐
//        System.out.println(strSet);

        // Set -> 중복 제거용으로 사용
        strSet.add("혜진5"); // 이미 있던 값 추가
//        System.out.println(strSet); // 중복 제거하고 출력

        // 값 조회
        String searchName = "혜진5";

        /*
        strSet 에 searchName 이 있으면 true, 없으면 false 출력하기
         */

        // j04_연산자 / Operation2 참고
        boolean isTrue = false;

        for(String str : strSet) {
            if(str.equals(searchName)){
                isTrue = true;
                break;
            }
        }
//        System.out.println(searchName+"이 'strSet'에 있나요? : "+isTrue);

        // 수정 -> Set 은 수정이 불가능 ! / 지우고(remove) 추가(add) 해줘야함
        /*
            searchName 을 찾아서 있으면 reName 으로 바꾸기
         */

        String reName = "new 혜진5";
        for(String str : strSet) {
            if(str.equals(searchName)){
                strSet.remove(searchName);
                strSet.add(reName);
                break;
            }
        }
//        System.out.println(strSet);

        // contains : 포함여부확인 함수.
//        System.out.println( strSet.contains(searchName));

        // reName 지우고 다시 기존에 있던 searchName 넣기
        if(strSet.contains(reName)){
            strSet.remove(reName);
            strSet.add(searchName);
        }
        System.out.println(strSet);
    }
}
