package j15_Object클래스;
/*
 * 클래스의 특징
 * 모든 클래스는 Object 클래스를 상속받는다.
 *
 */
public class ObjectTest {

    private String name;
    private String address;

    public ObjectTest() {}

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

//    public void showInfo(){
//        System.out.println("name = " + name);
//        System.out.println("address = " + address);
//    }

    public String showInfo(){
        return "name = " + name + " address = " + address;
    }

    @Override
    public String toString(){
        return "name = " + name + " address = " + address;
    }
}
