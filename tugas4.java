public class tugas4 {
    public static int[] jumlahMarmut(int bulan) {
        int[] hasil = new int[3];
        if (bulan == 1) {
            hasil[0] = 0;
            hasil[1] = 1;
            hasil[2] = 1;
            return hasil;
        } else if (bulan == 2) {
            hasil[0] = 0;
            hasil[1] = 1;
            hasil[2] = 1;
            return hasil;
        }
        int[] bulanSebelumnya = jumlahMarmut(bulan - 1);
        int[] duaBulanSebelumnya = jumlahMarmut(bulan - 2);
        hasil[0] = bulanSebelumnya[1];
        hasil[1] = bulanSebelumnya[0] + bulanSebelumnya[1];
        hasil[2] = hasil[0] + hasil[1];
        return hasil;
    }
    public static void main(String[] args) {
        for (int bulan = 1; bulan <= 12; bulan++) {
            int[] hasil = jumlahMarmut(bulan);
            System.out.println("\nBulan ke-" + bulan + ": ");
            System.out.println("Belum Produktif = " + hasil[0]);
            System.out.println("Produktif = " + hasil[1] );
            System.out.println("Total = " + hasil[2]);
        }
    }
}