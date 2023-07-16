public class Pattern1
	{
    public static void main(String[] args) {
       int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}