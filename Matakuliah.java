public class Matakuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public Matakuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public static Matakuliah[] daftarMK = new Matakuliah[10]; // Bisa tampung 10 matkul
    public static int jumlahMK = 0;

    static {
        // Isi manual
        daftarMK[jumlahMK++] = new Matakuliah("MK001", "Aljabar", 2);
        daftarMK[jumlahMK++] = new Matakuliah("MK002", "Struktur Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah("MK003", "Basis Data", 3);
        daftarMK[jumlahMK++] = new Matakuliah("MK004", "Desain Web", 3);
    }

    public static void tampilDaftarMataKuliah() {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Kode: " + daftarMK[i].kodeMK + ", Nama: " + daftarMK[i].namaMK + ", SKS: " + daftarMK[i].sks);
        }
    }
}
