import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        double s1 = scanner.nextDouble();
        
        System.out.println("Nhap so thu hai: ");
        double s2 = scanner.nextDouble();

        System.out.println("Nhap so thu ba: ");
        double s3 = scanner.nextDouble();

        double min = s1;

        if(s2 < min) {
            min = s2;
        }
        if(s3 < min) {
            min = s3;
        }

        System.out.println("Gia tri nho nhat la: " + min);

        scanner.close();
    }
}
