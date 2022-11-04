package j18_제네릭;


import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();
        ResponseData<String> responseData =
                new ResponseData("날짜 저장 성공!",now.toString());

        ResponseData<Integer> responseData2 =
                new ResponseData("날짜 저장 성공!",10);

        System.out.println(responseData);
        System.out.println(responseData2);
    }
}
