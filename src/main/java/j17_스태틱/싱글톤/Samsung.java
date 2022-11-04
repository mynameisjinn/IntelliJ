package j17_스태틱.싱글톤;

public class Samsung {
    private String company;
    private int serialNumber;

    private static Samsung instance = null;

    private Samsung(){
        company = getClass().getName();
        serialNumber = 20200000;
    }
    private static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }
    public int createSerialNumber(){
        return serialNumber++;
    }
}
