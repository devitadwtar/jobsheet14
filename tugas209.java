import java.util.Scanner;

public class tugas209 {

    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc09.nextInt();

        int hasilPenjumlahan = penjumlahanRekursif(n);

        System.out.println("Penjumlahan dari 1 sampai " + n + " = " + hasilPenjumlahan);

        sc09.close();
    }
}
