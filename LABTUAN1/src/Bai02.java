import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong: ");
        double cr = scanner.nextDouble();

        System.out.println("Nhap chieu dai: ");
        double cd = scanner.nextDouble();

        double S = cr * cd;
        System.out.println("Dien tich hinh chu nhat: " + S);

        scanner.close();
    }
}
