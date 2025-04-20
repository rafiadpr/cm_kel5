public class PenilaianData {
    Penilaian[] penilaian = new Penilaian[5];

    public PenilaianData() {
        MahasiswaData data = new MahasiswaData();
        MataKuliahData mkData = new MataKuliahData();

        Mahasiswa[] mahasiswa = data.mahasiswa;
        Matakuliah05[] matakuliah = mkData.matakuliah;

        penilaian[0] = new Penilaian(mahasiswa[0], matakuliah[0], 80, 85, 90);
        penilaian[1] = new Penilaian(mahasiswa[0], matakuliah[1], 60, 75, 70);
        penilaian[2] = new Penilaian(mahasiswa[1], matakuliah[0], 75, 70, 80);
        penilaian[3] = new Penilaian(mahasiswa[2], matakuliah[1], 85, 90, 95);
        penilaian[4] = new Penilaian(mahasiswa[2], matakuliah[2], 80, 90, 65);
    }

    public void tampilkanPenilaian() {
        for (Penilaian p : penilaian) {
            p.tampil();
        }
    }
}
