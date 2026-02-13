import java.util.Scanner;
public class jobsheet1tugas3bagian2 {
    public static void inputJadwal(String[][] jadwal, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }
    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Nama MK", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }
    public static void cariHari(String[][] jadwal, int n, String hariCari) {
        boolean ditemukan = false;

        System.out.println("\nJadwal pada hari " + hariCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " +
                                    jadwal[i][1] + " | " +
                                    jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }
    public static void cariMataKuliah(String[][] jadwal, int n, String mkCari) {
        boolean ditemukan = false;

        System.out.println("\nHasil pencarian mata kuliah: " + mkCari);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Ruang: " + jadwal[i][1]);
                System.out.println("Hari : " + jadwal[i][2]);
                System.out.println("Jam  : " + jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, n, input);
        tampilSemua(jadwal, n);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hariCari = input.nextLine();
        cariHari(jadwal, n, hariCari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mkCari = input.nextLine();
        cariMataKuliah(jadwal, n, mkCari);

        input.close();
    }
}