package module6.lesson1;

public class DatabaseUserEntity {
    private String username;
    private String mail;
    private String phone;

    public DatabaseUserEntity(User user){
        this(user.getFirstName() + ' ' + user.getLastName(), user.getMail(), user.getPhoneNumber());
        System.out.println("DatabaseUserEntity User constructor");
    }

    public DatabaseUserEntity(String username, String mail, String phone) {
        System.out.println("String param constructor");
        this.username = username;
        this.mail = mail;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "DatabaseUserEntity{" +
                "username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
