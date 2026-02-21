public class DosenMain {

    static class Dosen {

        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;

        public Dosen() {
        }

        public Dosen(String idDosen, String nama, boolean statusAktif,
                    int tahunBergabung, String bidangKeahlian) {
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahlian;
        }

        public void tampilInformasi() {
            System.out.println("ID Dosen        : " + idDosen);
            System.out.println("Nama            : " + nama);
            System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
            System.out.println("Tahun Bergabung : " + tahunBergabung);
            System.out.println("Bidang Keahlian : " + bidangKeahlian);
            System.out.println("-------------------------------------");
        }

        public void setStatusAktif(boolean status) {
            this.statusAktif = status;
            System.out.println("Status dosen diperbarui menjadi: " +
                            (status ? "Aktif" : "Tidak Aktif"));
        }

        public int hitungMasaKerja(int thnSkrg) {
            int masaKerja = thnSkrg - tahunBergabung;
            return masaKerja;
        }

        public void ubahKeahlian(String bidang) {
            this.bidangKeahlian = bidang;
            System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
        }
    }

    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.idDosen = "D001";
        d1.nama = "Dr. Andi Wijaya";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        d1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Artificial Intelligence");
        d1.tampilInformasi();

        Dosen d2 = new Dosen("D002", "Prof. Budi Santoso", true,
                            2010, "Basis Data");

        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
        d2.setStatusAktif(true);
        d2.ubahKeahlian("Data Science");
        d2.tampilInformasi();
    }
}