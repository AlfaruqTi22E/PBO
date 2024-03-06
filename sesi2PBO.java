{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMWV6MXCG2sAs9uJMbGVpBP",
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
        "<a href=\"https://colab.research.google.com/github/AlfaruqTi22E/PBO/blob/main/sesi2PBO.ipynb\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
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
        "        System.out.println(\"Luas segitiga = \" + s1.getLuas());\n",
        "\n",
        "        // Membuat objek Buku dengan penulis \"J.K. Rowling\", judul \"Harry Potter and the Philosopher's Stone\", harga 100000, dan nomor_penerbit 1234\n",
        "        Buku b1 = new Buku(\"J.K. Rowling\", \"Harry Potter and the Philosopher's Stone\", 100000, 1234);\n",
        "\n",
        "        // Membuat objek Buku dengan penulis \"George R.R. Martin\", judul \"A Game of Thrones\", harga 150000, dan nomor_penerbit 5678\n",
        "        Buku b2 = new Buku(\"George R.R. Martin\", \"A Game of Thrones\", 150000, 5678);\n",
        "\n",
        "        // Menghitung harga total buku\n",
        "        double total = b1.getHarga() + b2.getHarga();\n",
        "\n",
        "        // Mencetak harga total buku\n",
        "        System.out.println(\"Harga total buku = \" + total);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}