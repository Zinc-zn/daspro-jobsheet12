import java.util.Scanner;
public class tugas3 {
public static boolean prima(int n, int cek) {
    if (n <= 1) {
        return false;
    }
    if (cek == 1) {
        return true;
    }
    if (n % cek == 0) {
        return false;
    }
    return prima(n, cek - 1);
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();
        if (prima(n, n - 1)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}