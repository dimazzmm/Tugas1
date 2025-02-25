public class OperasiMatriks {
    public static void main(String[] args) {
        // Program operasi matriks
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Menjumlahkan matriks A dan B
        int[][] hasilPenjumlahan = new int[2][3];
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan Matriks A dan Matriks B:");
        for (int i = 0; i < hasilPenjumlahan.length; i++) {
            for (int j = 0; j < hasilPenjumlahan[i].length; j++) {
                System.out.print(hasilPenjumlahan[i][j] + " ");
            }
            System.out.println();
        }

        // Mengalikan matriks A dan B
        int[][] hasilPerkalian = new int[matriksA.length][matriksB[0].length];
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksB[0].length; j++) {
                for (int k = 0; k < matriksA[0].length; k++) {
                    hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        // Menampilkan hasil perkalian
        System.out.println("Hasil Perkalian Matriks A dan Matriks B:");
        for (int i = 0; i < hasilPerkalian.length; i++) {
            for (int j = 0; j < hasilPerkalian[i].length; j++) {
                System.out.print(hasilPerkalian[i][j] + " ");
            }
            System.out.println();
        }
    }
}
