public class star {
    /*
     * public static void main(String[] args) {
     * 
     * for (int i = 1; i < 4; i++) {
     * System.out.println("*");
     * }
     * 
     * 
     * int n = 4;
     * int m = 6;
     * for (int i = 1; i <= n; i++) {
     * // inner loop
     * for (int j = 1; j <= m; j++) {
     * System.out.print("x");
     * }
     * System.out.println();
     * }
     */
    /*
     * int n = 5;
     * int m = 6;
     * // Outer loop
     * for (int i = 1; i <= n; i++) {
     * // Inner loop
     * for (int j = 1; j <= m; j++) {
     * // cell -> {i,j}
     * if (i == 1 || j == 1 || i == n || j == m) {
     * System.out.print("x");
     * } else {
     * System.out.print(" ");
     * }
     * }
     * System.out.println();
     * }
     * }
     */
    /*
     * public static void main(String[] args) {
     * int a = 5;
     * int b = 7;
     * for (int i = 1; i <= a; i++) {
     * // Inner loop
     * for (int j = 1; j <= b; j++) {
     * // Cell -> {i,j}
     * if (i == 1 || j == 1 || i == a || j == b)
     * System.out.print("x");
     * else {
     * System.out.print("  ");
     * }
     * 
     * }
     * System.out.println();
     * }
     * 
     * }
     */
    public static void main(String[] args) {
        int n = 5;
        // Outer loop
        for (int i = 1; i >= n; i--) {
            // Inner loop
            for (int j = 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
