import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class oddeven {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
