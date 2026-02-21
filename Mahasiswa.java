public class Mahasiswa {
    String nama;
    String nim;
    double ipk;
    String kelas;

    public Mahasiswa(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        updateIpk(ipk);
    }

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Andi", "2312345", 3.6, "TI-1A");

        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

        System.out.println("\n=== Update IPK Valid ===");
        mhs1.updateIpk(3.8);
        mhs1.tampilkanInformasi();

        System.out.println("\n=== Update IPK Tidak Valid ===");
        mhs1.updateIpk(4.5);
        mhs1.tampilkanInformasi();
    }
}