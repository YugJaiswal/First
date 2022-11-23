import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class age {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a >= 18)
            System.out.println("you are adult");
        else
            System.out.println("you are minor");

    }
}
