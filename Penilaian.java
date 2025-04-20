  public class Penilaian {
        Mahasiswa mahasiswa;
        Matakuliah05 mataKuliah;
        int nilaiTugas;
        int nilaiUTS;
        int nilaiUAS;
    
        public Penilaian(Mahasiswa mahasiswa, Matakuliah05 mataKuliah, int tugas, int uts, int uas) {
            this.mahasiswa = mahasiswa;
            this.mataKuliah = mataKuliah;
            this.nilaiTugas = tugas;
            this.nilaiUTS = uts;
            this.nilaiUAS = uas;
        }
    
        public double hitungNilaiAkhir() {
            return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        }

        public void tampil() {
            System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | " + "Nilai Akhir : " + hitungNilaiAkhir());
        }
    }

