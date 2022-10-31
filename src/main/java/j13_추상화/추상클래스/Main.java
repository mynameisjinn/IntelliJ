package j13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("스마트폰 공장1");
        TabletFactory tabletFactory = new TabletFactory();

//        Factory factory = new Factory();

        phoneFactory.produce("iPhone14");
        tabletFactory.produce("iPad Pro5");

        phoneFactory.printInfo();

    }
}
