package tugas.pkg1.pbo;
import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inputan pecahan oleh user
        System.out.print("Masukkan pecahan pertama (Pembilang/Penyebut): ");
        int pembilang1 = scanner.nextInt();
        int penyebut1 = scanner.nextInt();

        System.out.print("Masukkan pecahan kedua (Pembilang/Penyebut): ");
        int pembilang2 = scanner.nextInt();
        int penyebut2 = scanner.nextInt();

        System.out.print("Masukkan pecahan ketiga (Pembilang/Penyebut): ");
        int pembilang3 = scanner.nextInt();
        int penyebut3 = scanner.nextInt();
        
        // Perhitungan Penjumlahan, Pengurangan, Perkalian, dan Pembagian
        int HasilJumlahPembilang = (pembilang1 * penyebut2 * penyebut3) +
                                 (pembilang2 * penyebut1 * penyebut3) +
                                 (pembilang3 * penyebut1 * penyebut2);
        int HasilJumlahPenyebut = penyebut1 * penyebut2 * penyebut3;

        int HasilKurangPembilang = (pembilang1 * penyebut2 * penyebut3) -
                                 (pembilang2 * penyebut1 * penyebut3) -
                                 (pembilang3 * penyebut1 * penyebut2);
        int HasilKurangPenyebut = penyebut1 * penyebut2 * penyebut3;
      
        int HasilKaliPembilang = pembilang1 * pembilang2 * pembilang3;
        int HasilKaliPenyebut = penyebut1 * penyebut2 * penyebut3;

        int HasilBagiPembilang = pembilang1 * penyebut2 * penyebut3;
        int HasilBagiPenyebut = penyebut2 * pembilang2 * pembilang3;
        
        // Menampilkan Pecahan yang sudah diinputkan
        System.out.println("Pecahan pertama: " + pembilang1 + "/" + penyebut1);
        System.out.println("Pecahan kedua: " + pembilang2 + "/" + penyebut2);
        System.out.println("Pecahan ketiga: " + pembilang3 + "/" + penyebut3);
        
        // Menampilkan hasil dari Penjumlahan, Pengurangan, Perkalian, dan Pembagian
        System.out.println("Hasil Penjumlahan: " + simplify(HasilJumlahPembilang, HasilJumlahPenyebut));
        System.out.println("Hasil Pengurangan: " + simplify(HasilKurangPembilang, HasilKurangPenyebut));
        System.out.println("Hasil Perkalian: " + simplify(HasilKaliPembilang, HasilKaliPenyebut));
        System.out.println("Hasil Pembagian: " + simplify(HasilBagiPembilang, HasilBagiPenyebut));

        scanner.close();
    }

    public static String simplify(int pembilang, int pembagi) {
        int gcd = gcd(pembilang, pembagi);
        pembilang /= gcd;
        pembagi /= gcd;
        
        if ((pembilang < 0 && pembagi > 0) || (pembilang > 0 && pembagi < 0)) {
            pembilang *= -1;
            pembagi = Math.abs(pembagi);
        }

        return pembilang + "/" + pembagi;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}





