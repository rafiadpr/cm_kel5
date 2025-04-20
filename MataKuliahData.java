public class MataKuliahData {
    Matakuliah05[] matakuliah = new Matakuliah05[3];

    public MataKuliahData() {
        matakuliah[0] = new Matakuliah05("MK001", "Struktur Data", 3);
        matakuliah[1] = new Matakuliah05("MK002", "Basis Data", 3);
        matakuliah[2] = new Matakuliah05("MK003", "Desain Web", 3);
    }

    public void tampilkanMatakuliah() {
        for (Matakuliah05 mk : matakuliah) {
            mk.tampil();
        }
    }
}
