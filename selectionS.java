package Basic;

public class selectionS {
    public static void display(int[] arr) {
        for (int i =0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[])
    {

        for (int i = 0; i <arr.length-1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                   int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {23, 45, 19, 20, 44};
        System.out.println("Array before sorting:");
        display(arr);
        SelectionSort(arr);
        System.out.println("array after insertion:");
        display(arr);

    }
}
