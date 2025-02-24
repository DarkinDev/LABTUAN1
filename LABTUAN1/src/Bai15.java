import java.util.Scanner;

public class Bai15 {
    public static void TachNgayThang(String ngaythangnam) {
        if (!ngaythangnam.matches("\\d{2}[-/]\\d{2}[-/]\\d{4}")) {
            System.out.println("Định dạng ngày không hợp lệ! Vui lòng nhập theo dd/MM/yyyy hoặc dd-MM-yyyy.");
            return;
        }

        String[] a = ngaythangnam.split("[-/]");
        String ngay = a[0]; 
        String thang = a[1]; 
        String nam = a[2]; 

        System.out.println("Ngày: " + ngay);
        System.out.println("Tháng: " + thang);
        System.out.println("Năm: " + nam);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày (dd/MM/yyyy hoặc dd-MM-yyyy): ");
        String input = scanner.nextLine();

        TachNgayThang(input);

        scanner.close();
    }
}
