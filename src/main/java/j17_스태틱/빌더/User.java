package j17_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    // username 만 받아 생성자를 생성하고 싶은 경우
//    public User(String username){
//        this.username = username;
//    }

    // email 만 받아 생성자를 생성하고 싶은 경우
    // 변수명은 다르지만, 자료형이 같기 때문에 오버로딩 할 수 없음
    // -> NoArgsConstructor 와 Setters 를 통해 일일이 set 해주어야함
    // -> 대체하기 위해 빌더 등장
//    public User(String email){
//        this.email = email;
//    }

    public static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public User build(){
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }
    // User.builder 가 호출될 경우 실행됨
}
