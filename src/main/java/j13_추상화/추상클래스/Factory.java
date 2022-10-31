package j13_추상화.추상클래스;

public abstract class Factory {
    String name;

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model);
    public abstract void management();

    public String getName() {
        return name;
    }
    public void printInfo(){
        System.out.println("공장의 이름을 출력합니다.");
        System.out.println("공장이름 " + name);
    }
}
