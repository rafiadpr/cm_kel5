public class Matakuliah05 {
    String kodeMK;
    String namaMK;
    int sks;

    public Matakuliah05(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public static Matakuliah05[] daftarMK = new Matakuliah05[10]; // Bisa tampung 10 matkul
    public static int jumlahMK = 0;

    static {
        // Isi manual
        daftarMK[jumlahMK++] = new Matakuliah05("MK001", "Aljabar", 2);
        daftarMK[jumlahMK++] = new Matakuliah05("MK002", "Struktur Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah05("MK003", "Basis Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah05("MK004", "Desain Web", 3);
    }

    public static void tampilDaftarMataKuliah() {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Kode: " + daftarMK[i].kodeMK + ", Nama: " + daftarMK[i].namaMK + ", SKS: " + daftarMK[i].sks);
        }
    }
}
