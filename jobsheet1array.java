import java.util.Scanner;
public class jobsheet1array {

    public static String konversiHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 73) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 50) return "C";
        else if (nilai >= 39) return "D";
        else return "E";
    }

    public static double konversiSetara(String huruf) {
        switch (huruf) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Jumlah Mata Kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        int[] sks = new int[jumlahMK];

        double totalMutu = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama MK     : ");
            namaMK[i] = input.nextLine();

            System.out.print("Nilai Angka : ");
            nilaiAngka[i] = input.nextDouble();

            System.out.print("Bobot SKS   : ");
            sks[i] = input.nextInt();
            input.nextLine();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            nilaiSetara[i] = konversiSetara(nilaiHuruf[i]);

            totalMutu += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalMutu / totalSKS;
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("=======================================================================");
        System.out.printf("%-35s %-12s %-12s %-10s\n",
                        "Nama MK", "Nilai Angka", "Nilai Huruf", "Bobot");
        System.out.println("=======================================================================");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-10.2f\n",
                    namaMK[i],
                    nilaiAngka[i],
                    nilaiHuruf[i],
                    nilaiSetara[i]);
        }
        System.out.println("=======================================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        input.close();
    }
}
