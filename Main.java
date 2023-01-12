import java.util.ArrayList;
import java.util.List;

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

    private static <E extends Comparable<? super E>> void selectionSort(List<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = minIndex + 1; j < list.size(); j++) {
                int comparison = list.get(j).compareTo(list.get(minIndex));
                if (comparison < 0) {
                    minIndex = j;
                }
            }

            if (minIndex == i) {
                continue;
            }

            E temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }

    private static void printElements(ArrayList<Integer> numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}