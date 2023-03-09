import java.math.BigDecimal;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        BigDecimal[] arr = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextBigDecimal();
        }
        sc.close();
        System.out.println("Maximum value: " + findMax(arr));
    }
    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (BigDecimal x: arr) {
            if (x.compareTo(max) > 0) max = x;
        }
        return max;
    }
}
