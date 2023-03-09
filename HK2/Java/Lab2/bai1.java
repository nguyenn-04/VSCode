import java.util.*;
public class bai1 {
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
        System.out.println("Maximum value: " + findMax(arr));
        System.out.println("Minimum value: " + findMin(arr));
        System.out.println("Sum all even numbers: " + sumEven(arr));
        System.out.println("The numbers of elements in the array: " + countElements(arr));
        System.out.println("The number of prime elements in the array: " + countPrime(arr));
        System.out.print("Enter value k: ");
        int k = sc.nextInt();
        sc.close();
        System.out.println("The index of an element k in the array: " + find(arr, k));
        System.out.print("Square all elements of the array: ");
        square(arr);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
    //Cau 1
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x: arr) {
            if (x > max) max = x;
        }
        return max;
    }
    //Cau 2
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x: arr) {
            if (x < min) min = x;
        }
        return min;
    }
    //Cau 3
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int x: arr) {
            if (x % 2 == 0) sum += x;
        }
        return sum;
    } 
    //Cau 4
    public static int countElements(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) count ++;
        }
        return count;
    }
    //Cau 5
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static int countPrime(int[] arr) {
        int count = 0;
        for (int x: arr) {
        }
        return count;
    }
    //Cau 6
    public static int find(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return -1;
    }
    //Cau 7
    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}