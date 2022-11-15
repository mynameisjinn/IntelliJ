package j25_문자열;

public class String6 {
    public static void main(String[] args) {

        String httpRequest = "/user/1";
        /*
            문자열이 비어있지 않으려면
            1. null X -> 주소값이 빈 경우
            2. "" X -> 문자열이 빈 경우
            3. " " -> 스페이스바를 사용하여 빈 경우
         */

        // 해당 경우 NullPointerException 발생 가능 - null 이 아닌지 부터 먼저 체크해야함!
        if(!httpRequest.replaceAll(" ","").equals("") && httpRequest != null) {
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }

        /* isBlank() - jdk11 버전 부터 사용 가능!
           isEmpty() - " " 를 공백으로 보지 않음
         */

        if(!httpRequest.isBlank()){
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
