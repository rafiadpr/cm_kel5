
import java.util.Scanner;

public class SiakadMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaData mahasiswaData = new MahasiswaData();
        int pilihan;

        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiwa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    mahasiswaData.tampilkanMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    mahasiswaData.tampilkanMatakuliah();
                    break;
                case 3:
                    mahasiswaData.tampilkanPenilaian();
                    break;
                case 4:
                    mahasiswaData.urutkanBerdasarkanNilai();
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = input.nextLine();
                    mahasiswaData.cariMahasiswaByNIM(cari);
                    break;
                case 0:
                    System.out.println("Program Selesai! Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
