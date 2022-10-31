package j12_상속;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal 생성");
    }

    public void move(){

        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
