import java.util.Scanner;

public class bubble {

    // =========================
    // CLASS DATA MAHASISWA
    // =========================
    static class Mahasiswa {
        String nim, nama, kelas;
        double ipk;

        Mahasiswa(String nim, String nama, String kelas, double ipk) {
            this.nim = nim;
            this.nama = nama;
            this.kelas = kelas;
            this.ipk = ipk;
        }

        void tampil() {
            System.out.println(nim + " | " + nama + " | " + kelas + " | " + ipk);
        }
    }

    // =========================
    // BUBBLE SORT (INT)
    // =========================
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    // =========================
    // SELECTION SORT (INT)
    // =========================
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    // =========================
    // INSERTION SORT (INT)
    // =========================
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j <= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void tampilArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // =========================
    // SORTING MAHASISWA (IPK)
    // =========================
    
    // BUBBLE SORT - DESCENDING (Tinggi ke Rendah)
    static void bubbleSortMhs(Mahasiswa[] mhs, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (mhs[j].ipk < mhs[j + 1].ipk) { 
                    Mahasiswa tmp = mhs[j];
                    mhs[j] = mhs[j + 1];
                    mhs[j + 1] = tmp;
                }
            }
        }
    }

    // SELECTION SORT - ASCENDING (Rendah ke Tinggi)
    static void selectionSortMhs(Mahasiswa[] mhs, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (mhs[j].ipk < mhs[min].ipk) {
                    min = j;
                }
            }
            Mahasiswa tmp = mhs[min];
            mhs[min] = mhs[i];
            mhs[i] = tmp;
        }
    }

    // INSERTION SORT - ASCENDING (Rendah ke Tinggi)
    static void insertionSortMhs(Mahasiswa[] mhs, int n) {
        for (int i = 1; i < n; i++) {
            Mahasiswa key = mhs[i];
            int j = i - 1;
            while (j >= 0 && mhs[j].ipk > key.ipk) {
                mhs[j + 1] = mhs[j];
                j--;
            }
            mhs[j + 1] = key;
        }
    }

    static void tampilMhs(Mahasiswa[] mhs, int n) {
        System.out.println("------------------------------------");
        for (int i = 0; i < n; i++) {
            mhs[i].tampil();
        }
        System.out.println("------------------------------------");
    }

    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {

        // Bagian 1: Array Integer
        int[] c = {3, 1, 4, 2, 5};

        System.out.println("=== HASIL SORTING INTEGER ===");

        insertionSort(c);
        System.out.print("Insertion Sort : "); tampilArray(c);
        System.out.println();

        // Bagian 2: Array Objek Mahasiswa
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = Integer.parseInt(sc.nextLine());
        Mahasiswa[] mhs = new Mahasiswa[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("\nInput Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            mhs[i] = new Mahasiswa(nim, nama, kelas, ipk);
        }

        System.out.println("\nData Awal:");
        tampilMhs(mhs, jml);

        System.out.println("\nBubble Sort (DESCENDING IPK):");
        bubbleSortMhs(mhs, jml);
        tampilMhs(mhs, jml);

        System.out.println("\nSelection Sort (ASCENDING IPK):");
        selectionSortMhs(mhs, jml);
        tampilMhs(mhs, jml);

        System.out.println("\nInsertion Sort (ASCENDING IPK):");
        insertionSortMhs(mhs, jml);
        tampilMhs(mhs, jml);
        
        sc.close();
    }
}