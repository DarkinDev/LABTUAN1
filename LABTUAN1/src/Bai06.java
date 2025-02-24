import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap canh thu nhat: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap canh thu hai: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap canh thu ba: ");
        double c = scanner.nextDouble();

        if(a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba canh tao ra 1 tam giac hop le.");
        } else {
            System.out.println("Ba canh khong tao ra 1 tam giac hop le.");
        }

        scanner.close();
    }
}
