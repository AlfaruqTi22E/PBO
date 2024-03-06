import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konversi Suhu
        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = input.nextDouble();
        double celcius = reamur * 5 / 4;
        double fahrenheit = reamur * 9 / 4 + 32;
        double kelvin = reamur * 5 / 4 + 273.15;
        System.out.println("Suhu dalam Celcius: " + celcius + "°C");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Suhu dalam Kelvin: " + kelvin + "K");

        // Hitung Umur
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = input.nextInt();
        final int TAHUN_SEKARANG = 2024;
        int umur = TAHUN_SEKARANG - tahunLahir;
        System.out.println("Umur Anda adalah: " + umur + " tahun");

        // Segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan panjang sisi miring segitiga: ");
        double sisiMiring = input.nextDouble();
        double luas = alas * tinggi / 2;
        double keliling = alas + tinggi + sisiMiring;
        System.out.println("Luas segitiga adalah: " + luas + " satuan luas");
        System.out.println("Keliling segitiga adalah: " + keliling + " satuan panjang");

        // Tutup scanner
        input.close();
    }
}
