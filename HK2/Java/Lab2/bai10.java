import java.util.*;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.print("Enter value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("------------------");
        if (checkArr(arr)) System.out.println("Not");
        else System.out.println("The third largest in an array: " + thirdElement(arr));
        
    }
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public static boolean checkArr(int[] arr) {
        sortArray(arr);
        int check = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) check++;
        }
        if (check >= 2) return false;
        return true;
    }
    public static int thirdElement(int[] arr) {
        int first = arr[0], second = arr[1], third = arr[2];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == first) {
                second = arr[i + 1];
                third = arr[i + 2];
            } else if (arr[i] == second) {
                third = arr[i + 1];
            }

        }
        return third;
    }
}
