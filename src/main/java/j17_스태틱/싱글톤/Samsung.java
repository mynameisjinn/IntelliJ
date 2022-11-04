package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {

    @Getter // company 만 getter 생성
    private String company;
    private int serialNumber;

    private static Samsung instance = null;

    private Samsung(){
        // company 라는 변수에 클래스명이 들어가도록
        company = getClass().getSimpleName();
        serialNumber = 20220000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }
//    public static Samsung getSamsung(){
//        return new Samsung(); // 매번 삼성객체를 할때마다 new 를 해주면
//                              // public 을 사용하는 것과 마찬가지임
//    }

    public String createSerialNumber(String model){
        return model +"_"+ ++serialNumber;
    }
}
