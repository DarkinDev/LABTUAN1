import java.util.Scanner;
public class Bai13 {
    public static int demsotu (String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap mot chuoi: ");
        String input = scanner.nextLine();

        System.out.println("So tu trong chuoi la: " + demsotu(input));

        scanner.close();
    }
}
