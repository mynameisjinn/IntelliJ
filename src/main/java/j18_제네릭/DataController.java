package j18_제네릭;


import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();
        ResponseData responseData =
                new ResponseData("날짜 저장 성공!",now.toString());
        System.out.println(responseData);
    }


}
