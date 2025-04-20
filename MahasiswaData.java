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

}
