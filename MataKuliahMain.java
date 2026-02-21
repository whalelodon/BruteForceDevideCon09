public class MataKuliahMain {
    static class MataKuliah {

        String kodeMK;
        String nama;
        int sks;
        int jumlahJam;

        public MataKuliah() {
        }

        public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
            this.kodeMK = kodeMK;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }

        public void tampilInformasi() {
            System.out.println("Kode MK    : " + kodeMK);
            System.out.println("Nama MK    : " + nama);
            System.out.println("SKS        : " + sks);
            System.out.println("Jumlah Jam : " + jumlahJam);
            System.out.println("-----------------------------");
        }

        public void ubahSKS(int sksBaru) {
            sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi " + sks);
        }

        public void tambahJam(int jam) {
            jumlahJam += jam;
            System.out.println("Jumlah jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
        }

        public void kurangiJam(int jam) {
            if (jumlahJam - jam >= 1) {
                jumlahJam -= jam;
                System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
            } else {
                System.out.println("Pengurangan gagal. Jumlah jam tidak mencukupi.");
            }
        }
    }

    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah mk2 = new MataKuliah("IF202", "Struktur Data", 3, 6);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(5);
        mk2.kurangiJam(5); // contoh gagal karena sudah dikurangi
        mk2.tampilInformasi();
    }
}
