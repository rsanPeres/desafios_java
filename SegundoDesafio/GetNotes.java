import java.util.Scanner;

public class GetNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        scanner.close();

        double[] notes = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
        double[] coin = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        System.out.println("NOTAS:");
        value = amountOfMoney(true, value, notes);

        System.out.println("MOEDAS:");
        value = amountOfMoney(false, value, coin);
    }
    
    public static double amountOfMoney(boolean note, double value, double[] money){
        for(double val : money){
            int qtdMoney = (int) (value/val);
            if(note){
                System.out.println(qtdMoney + " nota(s) de R$ " + String.format("%.2f", val));
            }else{
                System.out.println(qtdMoney + " moeda(s) de R$ " + String.format("%.2f", val));
            }
            value %= val;
        }
        return value;
    }
}
