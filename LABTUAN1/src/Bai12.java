import java.util.Scanner;;
public class Bai12 {
    public static boolean doixung (int n) {
        int sobandau = n;
        int sodao = 0;
        n = Math.abs(n);

        while (n > 0) {
            sodao = sodao * 10 + n % 10;
            n /= 10;
        }

        return sodao == Math.abs(sobandau);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap mot so nguyen: ");
        int num = scanner.nextInt();

        if (doixung(num)) {
            System.out.println(num + " la so doi xung.");
        } else {
            System.out.println(num + " khong phai so doi xung.");
        }

        scanner.close();
    }
}
