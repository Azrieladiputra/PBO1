package com.mycompany.minpro12;

import model.SportFacility;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Gunakan try-with-resources untuk memastikan Scanner ditutup secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n--- Manajemen Fasilitas Olahraga ---");
                System.out.println("1. Tambah Fasilitas");
                System.out.println("2. Lihat Semua Fasilitas");
                System.out.println("3. Ubah Fasilitas");
                System.out.println("4. Hapus Fasilitas");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");

                try {
                    // Menerima input pilihan dari pengguna
                    int pilihan = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer setelah input integer

                    switch (pilihan) {
                        case 1 -> {
                            System.out.print("Masukkan nama fasilitas: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan tipe fasilitas: ");
                            String tipe = scanner.nextLine();
                            System.out.print("Masukkan kapasitas fasilitas: ");
                            int kapasitas = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            
                            // Membuat objek fasilitas baru dan menambahkannya
                            SportFacility fasilitasBaru = new SportFacility(nama, tipe, kapasitas);
                            SportFacilityService.addFacility(fasilitasBaru);
                        }
                        case 2 -> {
                            // Menampilkan semua fasilitas yang ada
                            SportFacilityService.viewFacilities();
                        }
                        case 3 -> {
                            // Mengubah fasilitas
                            System.out.print("Masukkan nama fasilitas yang akan diubah: ");
                            String namaLama = scanner.nextLine();
                            System.out.print("Masukkan nama baru fasilitas: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan tipe baru fasilitas: ");
                            String tipeBaru = scanner.nextLine();
                            System.out.print("Masukkan kapasitas baru fasilitas: ");
                            int kapasitasBaru = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            
                            // Memanggil metode untuk mengubah fasilitas
                            SportFacilityService.updateFacility(namaLama, namaBaru, tipeBaru, kapasitasBaru);
                        }
                        case 4 -> {
                            // Menghapus fasilitas
                            System.out.print("Masukkan nama fasilitas yang akan dihapus: ");
                            String namaFasilitas = scanner.nextLine();
                            SportFacilityService.deleteFacility(namaFasilitas);
                        }
                        case 5 -> {
                            // Keluar dari aplikasi
                            running = false;
                            System.out.println("Keluar...");
                        }
                        default -> {
                            // Menangani input pilihan yang tidak valid
                            System.out.println("Opsi tidak valid! Silakan coba lagi.");
                        }
                    }
                } catch (Exception e) {
                    // Jika terjadi error, seperti input yang salah
                    System.out.println("Input tidak valid! Masukkan nomor yang benar.");
                    scanner.nextLine(); // Clear buffer untuk input berikutnya
                }
            }
        }
    }
}
