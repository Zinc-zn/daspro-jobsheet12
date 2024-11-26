import java.util.Scanner;

public class tugas1 {
    static int rekursif(int n){
        if (n<1) {
            return (0);
        }else {
            System.out.print(n+" ");
        }
        return (rekursif(n-1));
    }
    static int Iteratif(int n){
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = sc.nextInt();
        System.out.println(rekursif(angka));
        System.out.println(Iteratif(angka));

    }
}