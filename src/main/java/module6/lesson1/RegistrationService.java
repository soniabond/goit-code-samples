package module6.lesson1;

public class RegistrationService {

    public static void main(String[] args) {
        new RegistrationService().register();
    }

    public void register() {
//        User user = new User("Agata", "Petrova", "agata@gmaiil.com", "+65464854");
//        DatabaseUserEntity databaseUserEntity = new DatabaseUserEntity(user);
//        System.out.println("databaseUserEntity = " + databaseUserEntity);

//        String[] privs = {"createUsers", "banUsers"};
//        User adminUser = new AdminUser("Agata", "Petrova", "agata@gmaiil.com", "+65464854", privs);
//        System.out.println("adminUser = " + adminUser);

        User user = new User();
        System.out.println("user = " + user);
        User user1 = new User("Agata", "Petrova", "agata@gmaiil.com", "+65464854");
    }
}
