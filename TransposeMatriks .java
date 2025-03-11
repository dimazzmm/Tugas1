public class TransposeMatriks {
    public static void main(String[] args) {
        // Matriks A (2x3)
        int[][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matriks hasil transpose (3x2)
        int[][] matriksTranspose = new int[matriksA[0].length][matriksA.length];

        // Melakukan transpose matriks A
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                matriksTranspose[j][i] = matriksA[i][j];
            }
        }

        // Menampilkan matriks A
        System.out.println("Matriks A:");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan matriks hasil transpose
        System.out.println("Matriks Transpose:");
        for (int i = 0; i < matriksTranspose.length; i++) {
            for (int j = 0; j < matriksTranspose[i].length; j++) {
                System.out.print(matriksTranspose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

