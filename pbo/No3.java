package tugas.pkg1.pbo;

public class No3 {
    public static void main(String[] args) {
        char charX = 'X';
        char charY = 'y';

        int asciiX = (int) charX;
        int asciiY = (int) charY;

        int Jumlah = asciiX + asciiY;

        System.out.println("Kode ASCII untuk karakter 'X': " + asciiX);
        System.out.println("Kode ASCII untuk karakter 'y': " + asciiY);
        System.out.println("Jumlah Kode ASCII dari 'X' dan 'y': " + Jumlah);
    }
}
