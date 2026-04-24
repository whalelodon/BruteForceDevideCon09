package Minggu5;
import java.util.Scanner;

public class StudiKasus12 {
    int mid;
    static class mahasiswa{
        String nim, nama, prodi;

        public mahasiswa(String nim, String nama, String prodi){
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
        }
        public void tampilmahasiswa(){
            System.out.println("NIM: " +nim+ " | " + " Nama: " +nama+ " | " + " Prodi: " +prodi);
        }
    }
    static class Buku{
        String kodeBuku, judul;
        int tahunTerbit;

        public Buku(String kodeBuku, String judul, int tahunTerbit){
            this.kodeBuku = kodeBuku;
            this.judul = judul;
            this.tahunTerbit = tahunTerbit;
        }
        public void tampilbuku(){
            System.out.println("KODE: " +kodeBuku+ " | " + " Judul: " +judul+ " | " + " Tahun: " +tahunTerbit);
        }
    }
    static class peminjaman{
        mahasiswa  mhs;
        Buku buku;
        int terlambat, denda, lamaPinjam;
        int batasPinjam = 5;
        public peminjaman(mahasiswa mhs, Buku buku, int lamaPinjam){
            this.mhs = mhs;
            this.buku = buku;
            this.lamaPinjam = lamaPinjam;
            hitungdenda();
        }
        public void tampilkanpeminjaman(){
            System.out.println(mhs.nama + " | " + buku.judul + " | " + " Lama: " + lamaPinjam+ " | " + " Terlambat: " +terlambat+ " | " + " Denda: " +denda);
        }
        public void hitungdenda(){
            if(lamaPinjam > batasPinjam){
                terlambat = lamaPinjam - batasPinjam;
                denda = terlambat * 2000;
            }else{
                terlambat = 0;
                denda = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mahasiswa[] Mahasiswa = new mahasiswa[3];
        Mahasiswa[0] = new mahasiswa("22001", "Andi", "Teknik Informatika");
        Mahasiswa[1] = new mahasiswa("22002", "Budi", "Teknik Informatika");
        Mahasiswa[2] = new mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        Buku [] book = new Buku[4];
        book [0] = new Buku("B001", "Algoritma", 2020);
        book [1] = new Buku("B002", "Basis Data", 2019);
        book [2] = new Buku("B003", "Pemrograman", 2021);
        book [3] = new Buku("B004", "Fisika", 2024);
        
        peminjaman [] leverage = new peminjaman[5];
        leverage [0] = new peminjaman(Mahasiswa[0], book[0], 7);
        leverage [1] = new peminjaman(Mahasiswa[1], book[1], 0);
        leverage [2] = new peminjaman(Mahasiswa[2], book[2], 10);
        leverage [3] = new peminjaman(Mahasiswa[2], book[3], 6);
        leverage [4] = new peminjaman(Mahasiswa[0], book[2], 0);
        int pilihan;

        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa: ");
            System.out.println("2. Tampilkan Buku: ");
            System.out.println("3. Tampilkan Peminjaman: ");
            System.out.println("4. urutkan Berdasarkan Denda: ");
            System.out.println("5. Cari Berdasarkan NIM: ");
            System.out.println("6. Tampilkan Peminjaman Terlama: ");
            System.out.println("0. keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for(mahasiswa mhs : Mahasiswa){
                        mhs.tampilmahasiswa();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Daftar Buku: ");
                    for(Buku buku : book ){
                        buku.tampilbuku();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Data Peminjam: ");
                    for(peminjaman peminjam : leverage){
                        peminjam.tampilkanpeminjaman();
                    }
                    System.out.println();
                    break;
                case 4:
                    for(int i = 0; i < leverage.length; i++){
                        peminjaman temp = leverage[i];
                        int j = i - 1;
                        while(j >= 0 && leverage[j].denda < temp.denda){
                            leverage [j + 1] = leverage[j];
                            j--;
                        }
                        leverage[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for(peminjaman p : leverage){
                        p.tampilkanpeminjaman();
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = input.nextLine();

                    for(int i = 0; i < leverage.length; i++){
                        peminjaman temp = leverage[i];
                        int j = i - 1;
                        while(j >= 0 && leverage[j].mhs.nim.compareTo(temp.mhs.nim) > 0){
                            leverage[j + 1]= leverage[j];
                            j--;
                        }
                        leverage[j + 1] = temp;
                    }
                    int hasil = prosesBinarySearch(leverage, cariNIM, 0, leverage.length - 1);

                        if(hasil != -1){
                            leverage[hasil].tampilkanpeminjaman();
                        }else{
                            System.out.println("NIM yang dicari: " +cariNIM+ "Tidak Ditemukan");
                        }
                        System.out.println();
                    break;
                case 6:
                    int maks= leverage[0].lamaPinjam;

                        for(int i = 1; i < leverage.length; i++){
                            if(leverage[i].lamaPinjam > maks){
                                maks = leverage[i].lamaPinjam;
                            }
                        }

                        System.out.println("Peminjaman dengan lama pinjam terlama:");
                        for(peminjaman p : leverage){
                            if(p.lamaPinjam == maks){
                                p.tampilkanpeminjaman();
                            }
                        }
                        System.out.println();
                    break;
                case 0:
                    System.out.println(" Anda Keluar Dari program Sukses selalu :)");
                    break;
                default:
                        System.out.println("program tidak ditemukan, silahkan masukkan lagi");
                        System.out.println();
                    break;
            }
            
            
        } while (pilihan != 0);
        input.close();
    }
    public static int prosesBinarySearch(peminjaman[] arr, String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            
            // Karena NIM adalah String, kita gunakan compareTo
            int res = cari.compareTo(arr[mid].mhs.nim);
            
            if (res == 0) {
                return mid; // Data ditemukan
            }
            if (res < 0) {
                return prosesBinarySearch(arr, cari, left, mid - 1); // Cari ke kiri
            }
            return prosesBinarySearch(arr, cari, mid + 1, right); // Cari ke kanan
        }
        return -1; // Data tidak ditemukan
    }
}
