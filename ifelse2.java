import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        // if else

        {
            Scanner obj = new Scanner(System.in);
            {
                int a = obj.nextInt();
                int b = obj.nextInt();
                if (a == b) {
                    System.out.println("equal");
                } else {
                    if (a > b) {
                        System.out.println("a is greater");
                    } else {
                        System.out.println("a is lesser");
                    }
                }
            }

        }
    }

}
