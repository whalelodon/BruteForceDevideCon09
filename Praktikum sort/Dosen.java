public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; // true: Laki-laki, false: Perempuan
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama + " | JK: " + jk + " | Usia: " + usia);
    }
}
