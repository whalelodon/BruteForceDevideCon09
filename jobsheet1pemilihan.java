import java.util.Scanner;

public class jobsheet1pemilihan{
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int kuis, tugas, UTS, UAS;
        double nilaiAkhir = 0;
        
        System.out.print("Masukkan Nilai Tugas Anda: ");
        tugas = masukkan.nextInt();
        System.out.print("Masukkan Nilai Kuis Anda: ");
        kuis = masukkan.nextInt();
        System.out.print("Masukkan Nilai UTS Anda: ");
        UTS = masukkan.nextInt();
        System.out.print("Masukkan Nilai UAS Anda: ");
        UAS = masukkan.nextInt();

        nilaiAkhir = (((tugas*0.2) + (kuis*0.2) + (UTS*0.3) + (UAS * 0.3)));
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==================");
        System.out.println("Nilai tugas anda: " + tugas);
        System.out.println("Nilai kuis anda: " + kuis);
        System.out.println("Nilai UTS anda: " + UTS);
        System.out.println("Nilai UAS anda: " +UAS);
        System.out.println("===================");
        if(nilaiAkhir > 100){
            System.out.println("Nilai Anda Tidak Valid");
            return;
        }
        System.out.println("Nilai Akhir anda: " + nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <=100){
            System.out.print("Nilai Huruf:A\n");
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.print("Nilai Huruf:B+\n");
        }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.print("Nilai Huruf:B\n");
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.print("Nilai Huruf:C+\n");
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.print("Nilai Huruf:C\n");
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.print("Nilai Huruf:D\n");
        }else{
            System.out.print("Nilai Huruf:E\n");
        }
        System.out.println("===================");
        if(nilaiAkhir > 70){
            System.out.println("selamat anda lulus");
        }else{
            System.out.println("anda belum dinyatakan lulus");
        }
    }
}