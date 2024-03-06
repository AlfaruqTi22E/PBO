// Looping untuk mencetak "Saya semangat belajar java" sebanyak 10 baris
for (int i = 0; i < 10; i++) {
    System.out.println("Saya semangat belajar java");
}

// Looping deret angka genap dari 2 hingga 10
for (int i = 2; i <= 10; i += 2) {
    System.out.print(i + " ");
}
System.out.println("10"); // Menambahkan angka 10 di akhir secara manual

// Looping deret angka yang berkurang 3 setiap iterasi, dimulai dari 9
for (int i = 9; i >= -6; i -= 3) {
    System.out.print(i + " ");
}
System.out.println(); // Pindah baris

// Looping untuk perkalian 5 dengan angka 6 hingga 10
for (int i = 6; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}

// Looping untuk deret angka yang setiap angka berikutnya adalah penjumlahan semua angka sebelumnya
int sum = 0;
for (int i = 1; i <= 36; i++) {
    sum += i;
    if (sum > 36) break; // Jika jumlah melebihi 36, hentikan loop
    System.out.print(sum + " ");
}
