import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Merge Sort");
        int choice = scanner.nextInt();

        int[] array = { 5, 3, 8, 4, 2 };
        System.out.println("Array before sorting:");
        printArray(array);

        switch (choice) {
            case 1:
                SortingAlgorithms.bubbleSort(array);
                break;
            case 2:
                SortingAlgorithms.selectionSort(array);
                break;
            case 3:
                SortingAlgorithms.insertionSort(array);
                break;
            case 4:
                SortingAlgorithms.mergeSort(array);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Array after sorting:");
        printArray(array);
    }

    // Método para imprimir el arreglo
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para correr las pruebas dentro de Main
    public static void runTests() {
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
    }

    public static void testBubbleSort() {
        int[] array = { 5, 3, 8, 4, 2 };
        SortingAlgorithms.bubbleSort(array);
        int[] expected = { 2, 3, 4, 5, 8 };
        if (arraysEqual(array, expected)) {
            System.out.println("Bubble Sort Test Passed");
        } else {
            System.out.println("Bubble Sort Test Failed");
        }
    }

    public static void testSelectionSort() {
        int[] array = { 5, 3, 8, 4, 2 };
        SortingAlgorithms.selectionSort(array);
        int[] expected = { 2, 3, 4, 5, 8 };
        if (arraysEqual(array, expected)) {
            System.out.println("Selection Sort Test Passed");
        } else {
            System.out.println("Selection Sort Test Failed");
        }
    }

    public static void testInsertionSort() {
        int[] array = { 5, 3, 8, 4, 2 };
        SortingAlgorithms.insertionSort(array);
        int[] expected = { 2, 3, 4, 5, 8 };
        if (arraysEqual(array, expected)) {
            System.out.println("Insertion Sort Test Passed");
        } else {
            System.out.println("Insertion Sort Test Failed");
        }
    }

    // Método auxiliar para comparar arreglos
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
