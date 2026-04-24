package Minggu5.Minggu6;

public class MahasiswaBerprestasi {
    Mahasiswa12[] listMhs = new Mahasiswa12[5];
    int idx;
    int mid;
    // tambah data
    void tambah(Mahasiswa12 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    // tampil semua data
    void tampil() {
        for (Mahasiswa12 m : listMhs) {
            System.out.println("NIM   : " + m.nim);
            System.out.println("Nama  : " + m.nama);
            System.out.println("Kelas : " + m.kelas);
            System.out.println("IPK   : " + m.ipk);
            System.out.println("---------------------------");
        }
    }

    // sequential searching
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // tampil posisi
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    // tampil data hasil search
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double mencari, int left, int right){
        if(right >= left){
            mid = (left+right)/2;
            if(mencari == listMhs[mid].ipk){
                return mid;
            }
            else if(listMhs[mid].ipk < mencari){
                return findBinarySearch(mencari, left, mid-1);
            }
            else{
                return findBinarySearch(mencari, mid+1, right);
            }
        }
        return 0;
    }
}