{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMtkkx8IBsO+CZ6wlvORnL9",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/AlfaruqTi22E/PBO/blob/main/sesi2PBO.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "I6t7gaSpMYCO"
      },
      "outputs": [],
      "source": [
        "\n",
        "// Kelas Segitiga dengan properti alas, tinggi, dan metode setAlas, setTinggi, getLuas\n",
        "class Segitiga {\n",
        "    // Deklarasi properti\n",
        "    private double alas;\n",
        "    private double tinggi;\n",
        "\n",
        "    // Konstruktor untuk menginisialisasi alas dan tinggi\n",
        "    public Segitiga(double alas, double tinggi) {\n",
        "        this.alas = alas;\n",
        "        this.tinggi = tinggi;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mengubah nilai alas\n",
        "    public void setAlas(double alas) {\n",
        "        this.alas = alas;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mengubah nilai tinggi\n",
        "    public void setTinggi(double tinggi) {\n",
        "        this.tinggi = tinggi;\n",
        "    }\n",
        "\n",
        "    // Metode untuk menghitung luas segitiga\n",
        "    public double getLuas() {\n",
        "        return 0.5 * alas * tinggi;\n",
        "    }\n",
        "}\n",
        "\n",
        "// Kelas Buku dengan properti penulis, judul, harga, dan nomor_penerbit\n",
        "class Buku {\n",
        "    // Deklarasi properti\n",
        "    private String penulis;\n",
        "    private String judul;\n",
        "    private double harga;\n",
        "    private int nomor_penerbit;\n",
        "\n",
        "    // Konstruktor untuk menginisialisasi nilai penulis, judul, harga, dan nomor_penerbit\n",
        "    public Buku(String penulis, String judul, double harga, int nomor_penerbit) {\n",
        "        this.penulis = penulis;\n",
        "        this.judul = judul;\n",
        "        this.harga = harga;\n",
        "        this.nomor_penerbit = nomor_penerbit;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mendapatkan nilai penulis\n",
        "    public String getPenulis() {\n",
        "        return penulis;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mendapatkan nilai judul\n",
        "    public String getJudul() {\n",
        "        return judul;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mendapatkan nilai harga\n",
        "    public double getHarga() {\n",
        "        return harga;\n",
        "    }\n",
        "\n",
        "    // Metode untuk mendapatkan nilai nomor_penerbit\n",
        "    public int getNomor_penerbit() {\n",
        "        return nomor_penerbit;\n",
        "    }\n",
        "}\n",
        "\n",
        "// Kelas utama untuk menciptakan objek Segitiga dan Buku dan menghitung harga total\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        // Membuat objek Segitiga dengan alas 10 dan tinggi 15\n",
        "        Segitiga s1 = new Segitiga(10, 15);\n",
        "\n",
        "        // Mencetak luas segitiga\n",
        "        System.out.println(\"Luas segitiga: \" + s1.getLuas());\n",
        "\n",
        "        // Membuat objek Buku\n",
        "        Buku buku1 = new Buku(\"John Doe\", \"Java Programming\", 49.99, 123);\n",
        "\n",
        "        // Menampilkan informasi buku\n",
        "        System.out.println(\"Judul buku: \" + buku1.getJudul());\n",
        "        System.out.println(\"Penulis: \" + buku1.getPenulis());\n",
        "        System.out.println(\"Harga: $\" + buku1.getHarga());\n",
        "        System.out.println(\"Nomor penerbit: \" + buku1.getNomor_penerbit());\n",
        "    }\n",
        "}"
      ]
    }
  ]
}