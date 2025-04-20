public class DataMataKuliah {
    Matakuliah05[] daftarMK;
    int jumlahMK;

    public DataMataKuliah() {
        daftarMK = new Matakuliah05[10]; // bisa tampung 10 matkul
        jumlahMK = 0;

        // Isi manual
        daftarMK[jumlahMK++] = new Matakuliah05("MK001", "Aljabar", 2);
        daftarMK[jumlahMK++] = new Matakuliah05("MK002", "Struktur Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah05("MK003", "Basis Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah05("MK004", "Desain Web", 3);
    }

    public void tampilDaftarMataKuliah() {
        System.out.println("\n=== Daftar Mata Kuliah ===");
        for (int i = 0; i < jumlahMK; i++) {
            daftarMK[i].tampilMataKuliah05(); 
        }
    }
}
