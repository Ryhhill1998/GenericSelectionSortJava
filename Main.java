public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 3, 1, 9, 2};
        printElements(numbers);
        selectionSort(numbers);
        printElements(numbers);
    }

    private static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = minIndex + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex == i) {
                continue;
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }

    private static void printElements(int[] numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}