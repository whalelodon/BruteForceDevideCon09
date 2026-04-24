public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Penyimpanan penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Menggunakan Bubble Sort (Termuda -> Tertua)
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC (Bubble Sort).");
    }

    // Menggunakan Selection Sort (Tertua -> Termuda)
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC (Selection Sort).");
    }

    // Metode tambahan sesuai diagram
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) { // DSC
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
    }
}