package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
//        User user = User.builder();

        User user01 = User.builder().
                username("혜진").build();

        User user02 = User.builder().
                email("abc@example.com").build();

        System.out.println(user01);
        System.out.println(user02);

        User2 user03 = User2.builder().
                name("User2의 혜진").build();

        System.out.println(user03);

        // User2 에 있는 객체를 User 에서 생성
        User u = user03.to();
        System.out.println(u);
    }
}
