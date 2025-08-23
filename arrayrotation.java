import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        printArray(arr);

        // Perform rotations step by step
        for (int r = 1; r < n; r++) {
            rotateLeftByOne(arr, n);
            printArray(arr);           
        }
    }

    
    public static void rotateLeftByOne(int[] arr, int n) {
        int first = arr[0];   // store first element
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];   
        }
        arr[n - 1] = first;   
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
