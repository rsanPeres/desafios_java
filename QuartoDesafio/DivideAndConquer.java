import java.util.Scanner;

public class DivideAndConquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdLine = scanner.nextInt();

        for (int i = 0; i <= qtdLine; i++) {
            String line = scanner.nextLine();
            line = orderLine(line);
            System.out.println(line);
        }

        scanner.close();
    }

    public static String orderLine(String line) {
        int sizeLine = line.length();
        int half = sizeLine / 2;

        StringBuilder lineBuilder = new StringBuilder();

        for (int i = half - 1; i >= 0; i--) {
            lineBuilder.append(line.charAt(i));
        }

        for (int i = sizeLine - 1; i >= half; i--) {
            lineBuilder.append(line.charAt(i));
        }

        return lineBuilder.toString();
    }
}
