public class PerkalianMatriks {
    public static void main(String[] args) {
        // Matriks A (2x3)
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matriks B (3x2)
        int[][] matriksB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Matriks hasil perkalian A * B (2x2)
        int[][] hasil = new int[matriksA.length][matriksB[0].length];

        // Perkalian Matriks A dan B
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksB[0].length; j++) {
                for (int k = 0; k < matriksA[0].length; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        // Menampilkan hasil perkalian matriks
        System.out.println("Hasil Perkalian Matriks A dan Matriks B:");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
