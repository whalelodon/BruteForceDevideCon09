public class jobsheet1fungsi {

    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    public static int hitungPendapatan(int agl, int kel, int alo, int maw) {
        int total = 0;
        total = (agl * hargaAglonema)
              + (kel * hargaKeladi)
              + (alo * hargaAlocasia)
              + (maw * hargaMawar);
        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        System.out.println("=== PENDAPATAN ROYAL GARDEN ===\n");

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungPendapatan(
                    stok[i][0],
                    stok[i][1],
                    stok[i][2],
                    stok[i][3]
            );

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + statusCabang(pendapatan));
            System.out.println("---------------------------");
        }
    }
}
