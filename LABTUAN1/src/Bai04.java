import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap nam: ");
        int nam = scanner.nextInt();

        boolean namnhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        
        if(namnhuan) {
            System.out.println(nam + " la nam nhuan.");
        } else {
            System.out.println(nam + " khong phai la nam nhuan.");
        }

        scanner.close();
    }
}
