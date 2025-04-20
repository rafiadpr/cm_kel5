public class MahasiswaData {
    Mahasiswa[] mahasiswa = new Mahasiswa[3];
    Matakuliah05[] matakuliah = new Matakuliah05[3];
    Penilaian[] penilaian = new Penilaian[5];

    public MahasiswaData() {
        mahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        mahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        mahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
    }

    public void tampilkanMahasiswa() {
        for (Mahasiswa m : mahasiswa) {
            m.tampil();
        }
    }

    public void setPenilaian(Penilaian[] penilaian) {
        this.penilaian = penilaian;
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
