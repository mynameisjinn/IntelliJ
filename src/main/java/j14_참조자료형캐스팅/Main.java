package j14_참조자료형캐스팅;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControlArray centralControlArray = new CentralControlArray(new Power[5]);

//        CentralControlArray.addDevice(computer);
//        CentralControlArray.addDevice(speaker);
//        CentralControlArray.addDevice(led);

        centralControlArray.powerOn();
        System.out.println("====================");
        centralControlArray.powerOff();
    }
}
