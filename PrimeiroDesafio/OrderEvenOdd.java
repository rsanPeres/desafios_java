/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        int num = -1;
        while (num != 0) {
            num = scanner.nextInt();
            if (readNumbers(num)) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Collections.sort(even);

        Collections.sort(odd, Comparator.reverseOrder());

        printNums(even);
        printNums(odd);

        scanner.close();
        
    }

    public static boolean readNumbers(int num){
        return num % 2 == 0;
    }

    public static void printNums(List<Integer> nums){
        for (int num : nums){
            System.out.println(num);
        }
    }
}
