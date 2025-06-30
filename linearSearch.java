package Basic;

import java.util.Scanner;

public class linearSearch {
    public static int linearS(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int result = linearS(arr, target);
        if (result != -1) {
            System.out.println("Element is found at index: " + result);
        } else {
            System.out.println("Element is not found.");
        }

        sc.close();
    }
}
