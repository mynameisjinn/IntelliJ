package j13_추상화.추상클래스;

public class TabletFactory {
    public  TabletFactory() {

    }


    public void produce(String model){
        System.out.println("[ "+model+" ]모델 태블릿을 생산합니다.");
    }

}
