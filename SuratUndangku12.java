package Minggu5;

import java.util.Scanner;
import java.util.Stack;

// Class Surat sesuai diagram
    class Surat {
        String idSurat;
        String namaMahasiswa;
        String kelas;
        char jenisIzin; // 'S' atau 'I'
        int durasi;

        // Constructor kosong
        public Surat() {}

        // Constructor berparameter
        public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
            this.idSurat = idSurat;
            this.namaMahasiswa = namaMahasiswa;
            this.kelas = kelas;
            this.jenisIzin = jenisIzin;
            this.durasi = durasi;
        }

        public void tampil() {
            System.out.println("ID Surat      : " + idSurat);
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("Kelas         : " + kelas);
            System.out.println("Jenis Izin    : " + jenisIzin);
            System.out.println("Durasi        : " + durasi + " hari");
            System.out.println("-----------------------------");
        }
    }

    // Class StackSurat
    class StackSurat {
        Stack<Surat> stack = new Stack<>();

        // Terima surat (push)
        public void terimaSurat(Surat s) {
            stack.push(s);
            System.out.println("Surat berhasil ditambahkan.");
        }

        // Proses surat (pop)
        public void prosesSurat() {
            if (!stack.isEmpty()) {
                Surat s = stack.pop();
                System.out.println("Memproses surat:");
                s.tampil();
            } else {
                System.out.println("Tidak ada surat untuk diproses.");
            }
        }

        // Lihat surat terakhir (peek)
        public void lihatSuratTerakhir() {
            if (!stack.isEmpty()) {
                System.out.println("Surat terakhir:");
                stack.peek().tampil();
            } else {
                System.out.println("Stack kosong.");
            }
        }

        // Cari surat berdasarkan nama
        public void cariSurat(String nama) {
            boolean ditemukan = false;
            for (Surat s : stack) {
                if (s.namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan:");
                    s.tampil();
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Surat dengan nama tersebut tidak ditemukan.");
            }
        }
    }

    // Main class dengan menu
public class SuratUndangku12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StackSurat ss = new StackSurat();
            int pilihan;

            do {
                System.out.println("\n=== MENU STACK SURAT ===");
                System.out.println("1. Terima Surat Izin");
                System.out.println("2. Proses Surat Izin");
                System.out.println("3. Lihat Surat Izin Terakhir");
                System.out.println("4. Cari Surat (Nama Mahasiswa)");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine(); // buang newline

                switch (pilihan) {
                    case 1:
                        System.out.print("ID Surat: ");
                        String id = sc.nextLine();
                        System.out.print("Nama Mahasiswa: ");
                        String nama = sc.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = sc.nextLine();
                        System.out.print("Jenis Izin (S/I): ");
                        char jenis = sc.next().charAt(0);
                        System.out.print("Durasi (hari): ");
                        int durasi = sc.nextInt();

                        Surat s = new Surat(id, nama, kelas, jenis, durasi);
                        ss.terimaSurat(s);
                        break;

                    case 2:
                        ss.prosesSurat();
                        break;

                    case 3:
                        ss.lihatSuratTerakhir();
                        break;

                    case 4:
                        System.out.print("Masukkan nama mahasiswa: ");
                        String cari = sc.nextLine();
                        ss.cariSurat(cari);
                        break;

                    case 5:
                        System.out.println("Keluar program.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }

            } while (pilihan != 5);

            sc.close();
        }
}
