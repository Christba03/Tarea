public class App {
    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2 };
        System.out.println("Array before Bubble Sort:");
        printArray(array);

        SortingAlgorithms.bubbleSort(array);

        System.out.println("Array after Bubble Sort:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
