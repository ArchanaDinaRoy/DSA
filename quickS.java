package Basic;

public class quickS {

    public static void display(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Swap a[i+1] and a[high] (or pivot)
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 6, 1, 9, 3, 4, 11, 12, 5, 2};
        int size = a.length;

        System.out.println("Array before sorting: ");
        display(a);

        quickSort(a, 0, size - 1);

        System.out.println("Array after sorting: ");
        display(a);
    }
}
