import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------");
        System.out.print("Enter value k: ");
        int k = sc.nextInt();
        sc.close();
        int[] ans = divisibleNumbers(arr, k);
        System.out.print("The elements divisible by k: ");
        for (int x: ans) {
            System.out.print(x + " ");
        }
    }
    //Cau 9
    public static int[] divisibleNumbers(int[] arr, int k) {
        int count = 0, j = 0;
        for (int x: arr) {
            if (x % k == 0) count++;
        } 
        int[] new_arr = new int[count];
        for (int x: arr) {
            if (x % k == 0) new_arr[j++] = x;
        }
        return new_arr;
    }
}
