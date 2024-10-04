public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2 };
        System.out.println("Array before Selection Sort:");
        printArray(array);

        SortingAlgorithms.selectionSort(array);

        System.out.println("Array after Selection Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
