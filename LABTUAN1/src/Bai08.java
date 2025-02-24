import java.util.Scanner;
public class Bai08 {
    public static int sodautien(int n) {
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    
    public static int socuoicung(int n) {
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap 1 so nguyen: ");
        int num = scanner.nextInt();

        System.out.println("Chu so dau tien: " + sodautien(num));
        System.out.println("Chu so cuoi cung: " + socuoicung(num));

        scanner.close();
    }
}
