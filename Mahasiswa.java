public class Mahasiswa {
    String nim, nama, prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    public void tampilNIM() {
        System.out.println("Mahasiswa ditemukan : " + "NIM : " + nim + " | " + "Nama : " + nama + " | " + "Prodi : " + prodi);
    }
}
