//package j23_예외;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Exception3 {
//    public static void main(String[] args) {
//        Map<String,String> errorMap = new HashMap<String,String>();
//        errorMap.put("username","아이디는 한글일 수 없습니다.");
//        errorMap.put("password","비밀번호는 특수문자를 포함하여야합니다.");
//
//        try {
//            throw new CustomException("유효성 검사 실패", errorMap);
//        } catch (CustomException e) {
//            e.printStackTrace();
//            System.out.println("[예외 내용]");
//            e.getErrorMap(). for (key + ":" + value);
//            });
//        }
//    }
//}
