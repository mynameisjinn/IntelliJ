package j25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-1234-5678";

        // subString(int beginIndex) : 해당 인덱스부터 끝까지 출력
        String subStringLastNumber = phoneNumber.substring(1); // 0 번째 인덱스 출력안됨
        System.out.println(subStringLastNumber);

        int lastHypenIndex = phoneNumber.lastIndexOf("-");
        subStringLastNumber = phoneNumber.substring(lastHypenIndex+1);
        System.out.println("휴대폰 마지막 번호 4자리 출력 : "+subStringLastNumber);

        // subString(beginIndex, LastIndex)
        int fitstHyphenIndex = phoneNumber.indexOf("-");
        String subStringMidNumber = phoneNumber.substring(fitstHyphenIndex+1,lastHypenIndex );
        System.out.println("휴대폰 중간 번호 4자리 출력 : "+subStringMidNumber);
    }
}
