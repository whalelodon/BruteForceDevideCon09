package Minggu5.Minggu6;

import java.util.Scanner;

public class MahasiswaDemo{
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Scanner sc = new Scanner(System.in);

        int jumlah = 5;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("---------------------------");

            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }

        // tampil semua data
        System.out.println("\nData Mahasiswa:");
        list.tampil();

        // pencarian
        System.out.println("\nPencarian Data");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("\nMenggunakan Sequential Searching");

        int posisi = list.sequentialSearching(cari);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("--------------------------------");
        System.out.println(" Pencarian Data");
        System.out.println("--------------------------------");
        System.out.println("Masukkan IPK yang ingin dicari: ");
        System.out.print("IPK: ");
        double mencari = sc.nextDouble();
            System.out.println("-------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("-------------------------");
        double posisi2 = list.findBinarySearch(mencari, jumlah, posisi);
        int pss2 = (int)posisi2;
        list.tampilPosisi(mencari, pss2);
        list.tampilDataSearch(mencari, pss2);
    }
}