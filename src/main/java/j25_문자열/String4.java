package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");

        for (String role : roleArray) {
            System.out.println(role);
        }
        System.out.println();

        // Array >> List
        List<String> roleList = new ArrayList<String>();

        for (String role : roleArray) {
            roleList.add(role);
        }
        System.out.println(roleList);
        System.out.println();

        // 함수 이용

        List<String> roleListAuto = Arrays.asList(roleArray);
        System.out.println(roleListAuto);
        System.out.println();

        roleList = roleListAuto;
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role -> {
            System.out.println(role);
        });
        System.out.println();

        /* ROLE 이 붙여진 문자열만 ROLE 을 포함하여 출력하기
           -> ROLE_USER,ROLE_MANAGER,ROLE_ADMIN
           : startWith()
         */
        roleList.forEach(role -> {
            if(role.startsWith("ROLE")){
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);
        System.out.println();

        /*
            관리자리스트 만들기 - endWith()
         */
        roleList.forEach(role -> {
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                validRoleList2.add(role);
            }
        });
        System.out.println(validRoleList2);
        System.out.println();
    }
}
