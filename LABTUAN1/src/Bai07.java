import java.util.Scanner;
public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem Ly: ");
        double ly = scanner.nextDouble();

        System.out.println("Nhap diem Hoa: ");
        double hoa = scanner.nextDouble();
        
        System.out.println("Nhap diem Sinh: ");
        double sinh = scanner.nextDouble();
        
        System.out.println("Nhap diem Toan: ");
        double toan = scanner.nextDouble();
        
        System.out.println("Nhap diem May Tinh: ");
        double mt = scanner.nextDouble();

        double tongdiem5 = ly + hoa + sinh + toan + mt;
        double phantram = (tongdiem5 / 500) * 100;

        char diem;
        if (phantram > 90) {
            diem = 'A';
        } else if (phantram > 80) {
            diem = 'B';
        } else if (phantram > 70) {
            diem = 'C';
        } else if (phantram > 60) {
            diem = 'D';
        } else if (phantram > 40) {
            diem = 'E';
        } else {
            diem = 'F';
        }

        System.out.println("Ty le phan tram: " + phantram + "%");
        System.out.println("Xep hang: " + diem);

        scanner.close();
    } 
}
