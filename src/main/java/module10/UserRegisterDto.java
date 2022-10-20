package module10;

import java.io.Serializable;


// for gson no need to implement Serializable
public class UserRegisterDto implements Serializable {

    private String username;
    private String email;

    transient private String query = "select " + username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserRegisterDto{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
