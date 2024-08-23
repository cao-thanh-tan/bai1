import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số a từ người dùng
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        // Nhập số b từ người dùng
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        // Tính tổng, hiệu, tích và thương
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = b != 0 ? (double) a / b : Double.POSITIVE_INFINITY; // Kiểm tra chia cho 0

        // In kết quả ra màn hình
        System.out.println("Tổng của " + a + " và " + b + " là: " + sum);
        System.out.println("Hiệu của " + a + " và " + b + " là: " + difference);
        System.out.println("Tích của " + a + " và " + b + " là: " + product);
        System.out.println("Thương của " + a + " và " + b + " là: " + quotient);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}