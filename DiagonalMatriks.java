public class DiagonalMatriks {
    public static void main(String[] args) {
        // Matriks persegi
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan elemen diagonal utama
        System.out.println("Elemen Diagonal Matriks:");
        for (int i = 0; i < matriks.length; i++) {
            System.out.print(matriks[i][i] + " ");
        }
    }
}
