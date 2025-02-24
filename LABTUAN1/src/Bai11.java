import java.util.Scanner;
public class Bai11 {
    public static int daonguoc (int n) {
        int dao = 0;
        boolean am = n < 0;
        n = Math.abs(n);

        while (n > 0) {
            dao = dao * 10 + n % 10;
            n /= 10;
        }
        return am ? -dao : dao;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so 1 nguyen: ");
        int num = scanner.nextInt();

        System.out.println("So dao nguoc la: " + daonguoc(num));

        scanner.close();
    }
}
