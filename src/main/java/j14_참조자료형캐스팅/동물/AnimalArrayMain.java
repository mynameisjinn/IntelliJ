package j14_참조자료형캐스팅.동물;

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        System.out.println("[업캐스팅에서의 반복문]");
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        /* 업캐스팅을 하는 이유?
           반복을 하기위함 -> 배열을 생성하여서

           다운캐스팅에선 반복이 불가능하다.(메소드명이 다 달라서)
           가능하게 만들면 가능하긴 함..
         */
        System.out.println();
        System.out.println("[다운캐스팅에서의 반복문]");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human){
                ((Human)animals[i]).readBooks();
            }else if(animals[i] instanceof Tiger){
                ((Tiger)animals[i]).hunting();
            }
        }
    }
}
