package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    // User2 객체를 User 에서 생성
    // to() : 백엔드에서 많이 사용하는 방식
    public User to(){
        return User.builder().
                username(username).
                password(password).
                email(email).
                name(name).
                build();
    }
}
