public class StatistikArray {
    public static void main(String[] args) {
        // Array nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = nilai[0];

        // Menghitung total, nilai tertinggi, dan nilai terendah
        for (int i = 1; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // Menghitung rata-rata
        double rataRata = total / (double) nilai.length;

        // Menampilkan hasil statistik
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rataRata);
    }
}
