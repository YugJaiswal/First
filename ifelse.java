import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        if (age > 18) {
            System.out.println("you are perfect");
        } else {
            System.out.println("you are not eligible");
        }
    }

}
