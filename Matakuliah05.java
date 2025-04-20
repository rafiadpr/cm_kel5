public class Matakuliah05 {
    String kodeMK;
    String namaMK;
    int sks;

    public Matakuliah05(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampil() {
        System.out.println("Kode: " + kodeMK + " | Nama MK: " + namaMK + " | SKS: " + sks);
    }
}
