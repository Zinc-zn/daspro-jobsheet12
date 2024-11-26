import java.util.Scanner;

public class tugas2 {
    static int rekursif(int n){
        if (n==1) {
            System.out.print("1");
            return 1;
        }
        System.out.print(n+" + ");
        return (n+rekursif(n-1));
    }
    static int urut(int nomer, int max) {
        if (nomer > max) {
            return 0;
        }
        if (nomer == max) {
            System.out.print(nomer);
            return nomer;
        }
        System.out.print(nomer + "+");
        return nomer + urut(nomer + 1, max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();

        int total = rekursif(angka);
        System.out.println(" = "+total);
    }
}