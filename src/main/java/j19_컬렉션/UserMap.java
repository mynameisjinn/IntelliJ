package j19_컬렉션;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {

        Map<String,String> userMap = new HashMap<String,String>();

        userMap.put("username", "HyeJin");
        userMap.put("password", "1234");
        userMap.put("email", "hyejin@gmail.com");
        userMap.put("name", "김혜진");

        Set<String> KeySet = userMap.keySet();
        List<String> KeyList = new ArrayList<String>();
        KeyList.addAll(KeySet);

        String KeyName1 = "username";
        String KeyName2 = "password";
        String KeyName3 = "email";
        String KeyName4 = "name";

        String value1 = "HyeJin";
        String value2 = "1234";
        String value3 = "hyejin@gmail.com";
        String value4 = "김혜진";


        System.out.println(KeyName1+" >> "+ value1);
        System.out.println(KeyName2+" >> "+ value2);
        System.out.println(KeyName3+" >> "+ value3);
        System.out.println(KeyName4+" >> "+ value4);

    }
}
