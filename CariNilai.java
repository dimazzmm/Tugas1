public class CariNilai {
    public static void main(String[] args) {
        // Array nilai
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
        // Nilai yang dicari
        int cari = 90;
        // Variabel untuk status pencarian
        boolean ketemu = false;
        // Indeks nilai yang dicari
        int indeks = -1;

        // Mencari nilai dalam array
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ketemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan dalam array.");
        }
    }
}
