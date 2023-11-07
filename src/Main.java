import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] numb = {1.6, 1.2, -3.1, -2.3, 1.4, 2.7, 1.5, -5.2, 1.2, 1.1, -2.6, 7.4, 2.9, -3.7, 1.8};

        double result = 0;
        int n = 0;
        boolean negative = false;

        for (double element : numb) {

            if (!negative) {
                if (element < 0) {
                    negative = true;
                }
            } else if (element > 0) {
                result += element;
                n++;
            }
        }
        System.out.println(result / n);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        String input = s.replaceAll("[^а-яА-Я]", " ").toLowerCase();


        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right){
            if (input.charAt(left) != input.charAt(right)){
                isPalindrome=false;
            }
            left++;
            right--;
        }
        if (isPalindrome){
            System.out.println("Палиндром");
        }else {
            System.out.println("Не палиндром");
        }
    }
}
