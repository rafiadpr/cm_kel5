public class Penilaian {
    Mahasiswa mahasiswa;
    Matakuliah matakuliah;
    int tugas, uts, uas;

    public Penilaian(Mahasiswa mhs, Matakuliah mk, int tugas, int uts, int uas) {
        this.mahasiswa = mhs;
        this.matakuliah = mk;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return tugas * 0.3 + uts * 0.3 + uas * 0.4;
    }

    public void tampil() {
        System.out.println(mahasiswa.nama + " | " + matakuliah.namaMK + " | " + "Nilai Akhir : " + hitungNilaiAkhir());
    }
}
