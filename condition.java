import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int age = sc.nextInt();
         * if (age > 18) {
         * System.out.println("you are eligible");
         * } else {
         * System.out.println("you are not eligible");
         * }
         */
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }

}
