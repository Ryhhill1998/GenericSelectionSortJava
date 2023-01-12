import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);

        printElements(numbers);
        selectionSort(numbers);
        printElements(numbers);
    }

    private static void selectionSort(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minIndex = i;

            for (int j = minIndex + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex == i) {
                continue;
            }

            int temp = numbers.get(i);
            numbers.set(i, numbers.get(minIndex));
            numbers.set(minIndex, temp);
        }
    }

    private static void printElements(ArrayList<Integer> numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}