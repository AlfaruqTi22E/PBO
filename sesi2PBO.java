// Kelas Segitiga dengan properti alas, tinggi, dan metode setAlas, setTinggi, getLuas
class Segitiga {
    // Deklarasi properti
    private double alas;
    private double tinggi;

    // Konstruktor untuk menginisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Metode untuk mengubah nilai alas
    public void setAlas(double alas) {
        this.alas = alas;
    }

    // Metode untuk mengubah nilai tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }
}

// Kelas Buku dengan properti penulis, judul, harga, dan nomor_penerbit
class Buku {
    // Deklarasi properti
    private String penulis;
    private String judul;
    private double harga;
    private int nomor_penerbit;

    // Konstruktor untuk menginisialisasi nilai penulis, judul, harga, dan nomor_penerbit
    public Buku(String penulis, String judul, double harga, int nomor_penerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomor_penerbit = nomor_penerbit;
    }

    // Metode untuk mendapatkan nilai penulis
    public String getPenulis() {
        return penulis;
    }

    // Metode untuk mendapatkan nilai judul
    public String getJudul() {
        return judul;
    }

    // Metode untuk mendapatkan nilai harga
    public double getHarga() {
        return harga;
    }

    // Metode untuk mendapatkan nilai nomor_penerbit
    public int getNomor_penerbit() {
        return nomor_penerbit;
    }
}

// Kelas utama untuk menciptakan objek Segitiga dan Buku dan menghitung harga total
public class Main {
    public static void main(String[] args) {
        // Membuat objek Segitiga dengan alas 10 dan tinggi 15
        Segitiga s1 = new Segitiga(10, 15);

        // Mencetak luas segitiga
        System.out.println("Luas segitiga: " + s1.getLuas());

        // Membuat objek Buku
        Buku buku1 = new Buku("John Doe", "Java Programming", 49.99, 123);

        // Menampilkan informasi buku
        System.out.println("Judul buku: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());
        System.out.println("Harga: $" + buku1.getHarga());
        System.out.println("Nomor penerbit: " + buku1.getNomor_penerbit());
    }
          }
