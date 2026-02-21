public class MahasiswaNoAbsen {

    static class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;

        void tampilkanInformasi() {
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Kelas : " + kelas);
            System.out.println("IPK   : " + ipk);
            System.out.println("--------------------------");
        }

        void ubahKelas(String kelasBaru) {
            this.kelas = kelasBaru;
        }

        void updateIpk(double ipkBaru) {
            this.ipk = ipkBaru;
        }
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        mhs1.tampilkanInformasi();
    }
}