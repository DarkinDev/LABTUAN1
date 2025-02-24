import java.util.Scanner;
public class Bai14 {
    public static void TachHoTen(String HoTen) {
        String[] a = HoTen.trim().split("\\s+");

        if (a.length < 2) {
            System.out.println("Vui lòng nhập đầy đủ Họ và Tên.");
            return;
        }

        String ho = a[0];
        String ten = a[a.length - 1];
        String tenDem = "";

        for (int i = 1; i < a.length - 1; i++) {
            tenDem += a[i] + " ";
        }
        tenDem = tenDem.trim();

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + (tenDem.isEmpty() ? "Không có" : tenDem));
        System.out.println("Tên: " + ten);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Họ và Tên: ");
        String input = scanner.nextLine();

        TachHoTen(input);

        scanner.close();
    } 
}

    