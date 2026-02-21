public class MahasiswaMain {

    static class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;

        public Mahasiswa() {
        }

        public Mahasiswa(String nm, String nim, double ipk, String kls) {
            this.nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            this.kelas = kls;
        }

        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
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
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.3);
        mhs2.tampilkanInformasi();

        Mahasiswa mhs3 = new Mahasiswa("GILANG", "254601070", 3.87, "SIB 1D");
        mhs3.updateIpk(3.9);
        mhs3.tampilkanInformasi();
    }
}
