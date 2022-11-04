package j17_스태틱.빌더;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class User {
    private String username;
    private String password;
    private String email;
    private String name;

    public User(String username){
        this.username = username;
    }

    public static class UserBuilder {

    }

}
