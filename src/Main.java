import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("Vilket tal vill du veta gångertabellen till?");
        int tal = tgb.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tal + "*" + i + " = " +i * tal);
        }
    }
}