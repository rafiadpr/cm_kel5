import java.util.Scanner;

public class MahasiswaData {
    public static Penilaian[] daftarNilai = new Penilaian[5];
    public static int jumlahData = 0;

    public static void mulaiData() {
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        daftarMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman","Informatika");
        daftarMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso","Informatika");
        daftarMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi","Sistem Informasi Bisnis");

        Matakuliah05[] daftarMataKuliah = new Matakuliah05[3];
        daftarMataKuliah[0] = new Matakuliah05("MK001", "Struktur Data", 3);
        daftarMataKuliah[1] = new Matakuliah05("MK002", "Basis Data",3);
        daftarMataKuliah[2] = new Matakuliah05("MK003", "Desain Web",3);

        daftarNilai[0] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90);
        daftarNilai[1] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 60, 75, 70);
        daftarNilai[2] = new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80);
        daftarNilai[3] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[1], 85, 90, 95);
        daftarNilai[4] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[2], 80, 90, 65);

        jumlahData = 5;
    }
    public static void tampilkanData() {
        System.out.println("\nData Mahasiswa dan Mata Kuliah:");
        for (int i = 0; i < jumlahData; i++) {
            Penilaian nilai = daftarNilai[i];
            System.out.println("NIM       : " + nilai.mahasiswa.NIM);
            System.out.println("Nama      : " + nilai.mahasiswa.nama);
            System.out.println("Kode MK   : " + nilai.mataKuliah.kodeMK);
            System.out.println("Mata Kuliah : " + nilai.mataKuliah.namaMK);
            System.out.println("Tugas     : " + nilai.nilaiTugas);
            System.out.println("UTS       : " + nilai.nilaiUTS);
            System.out.println("UAS       : " + nilai.nilaiUAS);
            System.out.println();
        }
    }

    public static void tampilkanNilaiAkhir() {
        System.out.println("\nNilai Akhir Mahasiswa:");
        for (int i = 0; i < jumlahData; i++) {
            Penilaian nilai = daftarNilai[i];
            System.out.println("NIM        : " + nilai.mahasiswa.NIM);
            System.out.println("Nama       : " + nilai.mahasiswa.nama);
            System.out.println("Mata Kuliah: " + nilai.mataKuliah.namaMK);
            System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
            System.out.println();
        }
    }

    public static void urutkanNilai() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (daftarNilai[j].hitungNilaiAkhir() < daftarNilai[j + 1].hitungNilaiAkhir()) {
                    Penilaian sementara = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = sementara;
                }
            }
        }

        System.out.println("\nData Mahasiswa Setelah Diurutkan Berdasarkan Nilai Akhir (Tertinggi ke Terendah):");
        for (int i = 0; i < jumlahData; i++) {
            Penilaian nilai = daftarNilai[i];
            System.out.println("NIM        : " + nilai.mahasiswa.NIM);
            System.out.println("Nama       : " + nilai.mahasiswa.nama);
            System.out.println("Mata Kuliah: " + nilai.mataKuliah.namaMK);
            System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
            System.out.println();
        }
    }

    public static void cariMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM yang dicari: ");
        String cariNIM = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (daftarNilai[i].mahasiswa.NIM.equals(cariNIM)) {
                if (!ditemukan) {
                    System.out.println("\nData Mahasiswa Ditemukan:");
                    ditemukan = true;
                }
                System.out.println("NIM         : " + daftarNilai[i].mahasiswa.NIM);
                System.out.println("Nama        : " + daftarNilai[i].mahasiswa.nama);
                System.out.println("Mata Kuliah : " + daftarNilai[i].mataKuliah.namaMK);
                System.out.println("Tugas       : " + daftarNilai[i].nilaiTugas);
                System.out.println("UTS         : " + daftarNilai[i].nilaiUTS);
                System.out.println("UAS         : " + daftarNilai[i].nilaiUAS);
                System.out.println("Nilai Akhir : " + daftarNilai[i].hitungNilaiAkhir());
                System.out.println();
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }
}
