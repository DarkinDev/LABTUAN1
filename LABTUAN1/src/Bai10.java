import java.util.Scanner;
public class Bai10 {
    public static int demso (int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap mot so nguyen: ");
        int num = scanner.nextInt();

        System.out.println("So chu so: " + demso(num));

        scanner.close();
    }
}
