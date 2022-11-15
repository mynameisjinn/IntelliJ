package j25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        System.out.println(uuid.replaceAll("-",""));

        String uuidOnlyInt = uuid.replaceAll("-", "");
        String uuidHalfFront = null;
        String uuidHalfBack = null;
        uuidHalfFront = uuidOnlyInt.substring(0, uuidOnlyInt.length()/2);
        uuidHalfBack = uuidOnlyInt.substring(uuidOnlyInt.length()/2);

        System.out.println(uuidHalfFront);
        System.out.println(uuidHalfBack);
    }
}
