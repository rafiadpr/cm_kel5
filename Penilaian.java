public class Penilaian {
    Mahasiswa mahasiswa;
    Matakuliah05 matakuliah;
    double tugas, uts, uas, nilaiAkhir;

    public Penilaian(Mahasiswa mhs, Matakuliah05 mk, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.matakuliah = mk;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = hitungNilaiAkhir();
    }

    public double hitungNilaiAkhir() {
        return tugas * 0.3 + uts * 0.3 + uas * 0.4;
    }

    public void tampil() {
        System.out.println(mahasiswa.nama + " | " + matakuliah.namaMK + " | " + "Nilai Akhir : " + hitungNilaiAkhir());
    }
}
