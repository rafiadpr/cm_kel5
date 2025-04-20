public class MahasiswaData {
    Mahasiswa[] mahasiswa = new Mahasiswa[3];
    Matakuliah05[] matakuliah = new Matakuliah05[3];
    Penilaian[] penilaian = new Penilaian[5];

    public MahasiswaData() {
        mahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        mahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        mahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        matakuliah[0] = new Matakuliah05("MK001", "Struktur Data", 3);
        matakuliah[1] = new Matakuliah05("MK002", "Basis Data", 3);
        matakuliah[2] = new Matakuliah05("MK003", "Desain Web", 3);

        penilaian[0] = new Penilaian(mahasiswa[0], matakuliah[0], 80, 85, 90);
        penilaian[1] = new Penilaian(mahasiswa[0], matakuliah[1], 60, 75, 70);
        penilaian[2] = new Penilaian(mahasiswa[1], matakuliah[0], 75, 70, 80);
        penilaian[3] = new Penilaian(mahasiswa[2], matakuliah[1], 85, 90, 95);
        penilaian[4] = new Penilaian(mahasiswa[2], matakuliah[2], 80, 90, 65);
    }

    public void tampilkanMahasiswa() {
        for (Mahasiswa m : mahasiswa) {
            m.tampil();
        }
    }

    public void tampilkanMatakuliah() {
        for (Matakuliah05 mk : matakuliah) {
            mk.tampil();
        }
    }

    public void tampilkanPenilaian() {
        for (Penilaian p : penilaian) {
            p.tampil();
        }
    }

    public void urutkanBerdasarkanNilai() {
        for (int i = 0; i < penilaian.length - 1; i++) {
            for (int j = 0; j < penilaian.length - i - 1; j++) {
                if (penilaian[j].hitungNilaiAkhir() < penilaian[j + 1].hitungNilaiAkhir()) {
                    Penilaian temp = penilaian[j];
                    penilaian[j] = penilaian[j + 1];
                    penilaian[j + 1] = temp;
                }
            }
        }

        tampilkanPenilaian();
    }

    public void cariMahasiswaByNIM(String nim) {
        boolean ditemukan = false;
        for (Mahasiswa m : mahasiswa) {
            if (m.nim.equals(nim)) {
                m.tampilNIM();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
}
