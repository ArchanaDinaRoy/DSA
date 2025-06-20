package Basic;

public class BubbleS {
    public static void display(int[] arr) {
        for (int i =0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int arr[])
    {

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 19, 20, 44};
        System.out.println("Array before sorting:");
        display(arr);
        BubbleSort(arr);
        System.out.println("array after sorting:");
        display(arr);

    }
}
