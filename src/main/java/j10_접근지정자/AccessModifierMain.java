package j10_접근지정자;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001,"혜진");

        sam.showInfo();
        sam.setName("혜진2");
        sam.showInfo();

        System.out.println(sam.getName());
    }
}
