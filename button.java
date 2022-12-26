import java.util.Scanner;

public class button {
    public static void main(String[] args) {
        // buttons
        {
            Scanner obj = new Scanner(System.in);
            int button = obj.nextInt();

            if (button == 1) {
                System.out.println("Hello");
            } else if (button == 2) {
                System.out.println("Namestey");
            } else if (button == 3) {
                System.out.println("bonjour");
            } else {
                System.out.println("invallid button");
            }
        }
    }
}
