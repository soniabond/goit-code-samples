package module6;

import java.util.Arrays;

public class AdminUser extends User {
    private String [] privs;

    public AdminUser() {
        System.out.println("AdminUser constructor");
    }

    public AdminUser(String firstName, String lastName, String mail, String phoneNumber, String [] privs) {
        super(firstName, lastName, mail, phoneNumber);
        this.privs = privs;
    }

    public String[] getPrivs() {
        return privs;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "privs=" + Arrays.toString(privs) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
