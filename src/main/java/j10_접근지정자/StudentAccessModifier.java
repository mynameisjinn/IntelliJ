package j10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name;

    StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // setter - 외부로부터 받은 값(매게변수)을 안으로
    // getter - 안에 값을 끄집어 낸다 (return)
    // Alt + Insert : 자동완성

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("학번 : " + code);
        System.out.println("이름 : " + name);
        System.out.println();
    }
}
