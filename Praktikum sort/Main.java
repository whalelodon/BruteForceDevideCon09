import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataDosen ddsn = new DataDosen();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("Laki-laki? (true/false): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int us = sc.nextInt();
                    ddsn.tambah(new Dosen(kd, nm, jk, us));
                    break;
                case 2:
                    ddsn.tampil();
                    break;
                case 3:
                    ddsn.sortingASC();
                    ddsn.tampil();
                    break;
                case 4:
                    ddsn.sortingDSC();
                    ddsn.tampil();
                    break;
            }
        } while (pilih != 0);
    }
}
