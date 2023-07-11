import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CounterPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int target = scanner.nextInt();

        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        scanner.close();

        int count = countPairs(num, target);
        System.out.println(count);
    }

    public static int countPairs(int[] numbers, int target) {
        int count = 0;
        List<Integer> list = IntStream.of(numbers)
                                  .boxed()
                                  .collect(Collectors.toList());
        for (int num : numbers) {
            if (list.contains(num - target)) {
                count++;
            }
        }

        return count;
    }
}
