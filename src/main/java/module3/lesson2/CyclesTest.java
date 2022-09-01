package module3.lesson2;


import java.util.Arrays;
import java.util.Scanner;

public class CyclesTest {

    public static void main(String[] args) {
        String [] usernames = new String [3]; // numbers starts from 0
        usernames[0] = "ivan@gmail.com";
        usernames[2] = "daryna@gmail.com";
        usernames[1] = "newmaiul@gmail.com";

        /*argument */ //declace counter
//        for(/*argument */;/*condition continue loop*/;/*after loop operation*/) {
//
//        }

//        for(int i = 0; i < usernames.length; i++) {
//            sendMail(usernames[i]);
//        }
//
//        //foreach
//        for(String username : usernames) {
//            System.out.println(username);
//        }

        guessPassword();

    }

    public static void guessPassword() {
        String password = "12345";
        Scanner scanner = new Scanner(System.in);
        int limitWrongPasswords = 3;
        int currentNumberOfAttempts = 0;
        while (limitWrongPasswords > 0) {
            System.out.println("Enter password");
            String yourPassword = scanner.nextLine();
            if (password.equals(yourPassword)) {
                break;
            }
            System.out.println("I am here");
            limitWrongPasswords--;
        }

    }

    public static void sendMail(String mail) {
        System.out.println("Mail to " + mail + " is sent");
    }


}
