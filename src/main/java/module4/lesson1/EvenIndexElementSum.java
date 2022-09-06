package module4.lesson1;

// you have array of int.
// 1. print elements with even indexes
// 2. print their sum
// do for odd indexes the same!!!!!
public class EvenIndexElementSum {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 7, 6, 8, 10, 30, 15};
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
                sum += numbers[i];
        }
        System.out.println("sum = " + sum);
    }

}
