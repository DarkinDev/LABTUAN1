import java.util.Scanner;
public class Bai09 {
    public static int Tong (int n) {
        n = Math.abs(n);
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static int Tich (int n) {
        n = Math.abs(n);
        int tich = 1;
        if (n == 0) return 0;
        while (n > 0) {
            tich *= n % 10;
            n /= 10;
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int num = scanner.nextInt();

        System.out.println("Tong cac chu so: " + Tong(num));
        System.out.println("Tich cac chu so: " + Tich(num));

        scanner.close();
    }
}
