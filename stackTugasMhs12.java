package Minggu5;

import java.util.Scanner;

public class stackTugasMhs12 {
    
    // Inner class Mahasiswa
    static class mahasiswa {
        String nim, nama, kelas;
        int nilai;

        public mahasiswa(String nama, String nim, String kelas) {
            this.nama = nama;
            this.nim = nim;
            this.kelas = kelas;
            this.nilai = -1; // Default belum dinilai
        }
    }

    // Stack untuk konversi biner (Opsional sesuai kode awalmu)
    static class StackKonversi {
        int[] tumpukanBiner;
        int top, size;

        public StackKonversi() {
            this.size = 32;
            tumpukanBiner = new int[size];
            top = -1;
        }

        public void push(int data) {
            tumpukanBiner[++top] = data;
        }

        public int pop() {
            return tumpukanBiner[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    mahasiswa[] stack;
    int size, top;

    // PERBAIKAN: Nama constructor harus sama dengan nama class
    public stackTugasMhs12(int size) {
        this.size = size;
        stack = new mahasiswa[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public void push(mahasiswa mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
            System.out.println("Tugas " + mhs.nama + " berhasil dikumpulkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public mahasiswa pop() {
        if (!isEmpty()) return stack[top--];
        return null;
    }

    public mahasiswa peek() {
        if (!isEmpty()) return stack[top];
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada daftar tugas.");
        } else {
            System.out.println("Daftar Semua \tTugas");
            System.out.println("Nama \tNim \tKelas");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        }
    }
    public static String konversiDesimalKeBiner(int nilai){
        StackKonversi stack = new StackKonversi();
        while (nilai > 0){
            int sisa = nilai %2;
            stack.push(sisa);
            nilai = nilai /2;
        }
        String biner  = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackTugasMhs12 st = new stackTugasMhs12(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    st.push(new mahasiswa(nama, nim, kelas));
                    break;
                case 2:
                    mahasiswa dinilai = st.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai untuk(0-100) " + dinilai.nama + ": ");
                        dinilai.nilai = sc.nextInt();
                        if(dinilai.nilai > 100){
                            System.out.println("tidak masuk akal");
                            break;
                        }
                        System.out.println("Tugas " + dinilai.nama + " telah dinilai.");
                    } else {
                        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
                    }
                    String biner = stackTugasMhs12.konversiDesimalKeBiner(dinilai.nilai);
                    System.out.println("Nilai Biner Tugas: "+biner);
                    break;
                case 3:
                    mahasiswa topMhs = st.peek();
                    if (topMhs != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + topMhs.nama);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 4:
                    st.print();
                    break;
            }
        } while (pilih != 5);
    }
}