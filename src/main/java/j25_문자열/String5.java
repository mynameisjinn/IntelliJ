package j25_문자열;

public class String5 {
    public static void main(String[] args) {

        String httpMethod = "Get";

        if(httpMethod.equals("get")) {
            System.out.println("get 요청입니다.");
        }else{
            System.out.println("get 요청이 아닙니다.");
        }
        System.out.println();

        // equalsIgnoreCase() : 영문자의 대소문자를 무시하고 출력
        if(httpMethod.equalsIgnoreCase("get")) {
            System.out.println("get 요청입니다.");
        }else{
            System.out.println("get 요청이 아닙니다.");
        }
    }
}
