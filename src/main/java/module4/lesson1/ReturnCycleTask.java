package module4.lesson1;
// mail template. Given array with mails and usernames - send mails for everyone
// reverse an array
// find first duplicate (probably for HW)
// find frequency - (statistic generation)
// if sudoku solved correctly
public class ReturnCycleTask {

    public static void main(String[] args) {
        String targetUsername = "Ivan Petrenko";
        String [] studentsInGroup = {"Alan Po", "Anton Khliebnikov", "Bogdan Dubina",
        "Yuriy Myhayluk", "Andrii Shevchenko", "John Doe", "Dilan Obrayn", "Krzysztof Upal"};

        boolean studentPresentInGroup = isStudentPresentInGroup(studentsInGroup, targetUsername);

        System.out.println(targetUsername + " present in group: " + studentPresentInGroup);

        targetUsername = "John Doe";

        studentPresentInGroup = isStudentPresentInGroup(studentsInGroup, targetUsername);

        System.out.println(targetUsername + " present in group: " + studentPresentInGroup);



    }

    // if student present in selected group
    public static boolean isStudentPresentInGroup(String [] studentUsernames, String targetUsername) {

        for(String username: studentUsernames) {
            if (username.equals(targetUsername)) {
                return true;
            }
        }
        return false;
    }

    void defauldMethod() {
        System.out.println("Hello");
    }


}
