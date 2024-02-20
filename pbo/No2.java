package tugas.pkg1.pbo;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan (dalam juta): ");
        double tabungan = input.nextDouble();

        System.out.print("Apakah sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = input.nextBoolean();

        boolean dapatMenikah = (tabungan > 100) && calonPasangan;

        if (dapatMenikah) {
            System.out.println("Selamat! Anda dapat menikah.");
        } else {
            System.out.println("Maaf, belum dapat menikah. Perlu uang tabungan > 100jt dan calon pasangan.");
        }
    }
}
