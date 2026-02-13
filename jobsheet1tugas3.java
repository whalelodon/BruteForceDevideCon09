import java.util.Scanner;
public class jobsheet1tugas3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};
        char[][] KOTA = {
                {'B','A','N','T','E','N'},
                {'J','A','K','A','R','T','A'},
                {'B','A','N','D','U','N','G'},
                {'C','I','R','E','B','O','N'},
                {'B','O','G','O','R'},
                {'P','E','K','A','L','O','N','G','A','N'},
                {'S','E','M','A','R','A','N','G'},
                {'S','U','R','A','B','A','Y','A'},
                {'M','A','L','A','N','G'},
                {'T','E','G','A','L'}
        };

        System.out.print("Masukkan kode plat: ");
        char kodeInput = input.next().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (kodeInput == KODE[i]) {

                System.out.print("Nama Kota: ");

                for (int j = 0; j < KOTA[i].length; j++) {
                    if (KOTA[i][j] != 0) {
                        System.out.print(KOTA[i][j]);
                    }
                }
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan.");
        }

        input.close();
    }
}