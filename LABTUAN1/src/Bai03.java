import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap nhiet do (°F): ");
        double doF = scanner.nextDouble();

        double doC = (doF - 32) / 1.8;
        System.out.println("Nhiet do tuong ung (°C): " + doC);

        scanner.close();
    }
}
