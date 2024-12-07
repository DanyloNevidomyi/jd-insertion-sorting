package learning.java;

public class App {
    public static void main(String[] args) {
        int[] array = {7, 3, 5, 2, 4, 1, 6};

        System.out.println("Масив до сортування:");
        ArrayUtils.printArray(array);

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);

        System.out.println("Масив після сортування:");
        ArrayUtils.printArray(array);
    }
}
