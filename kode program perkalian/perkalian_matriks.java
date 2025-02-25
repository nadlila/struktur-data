public class perkalian_matriks {

    public static void main(String[] args) {
        int [][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int [][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int barisA = a.length;
        int kolomA = a[0].length;
        int kolomB = b[0].length;
        int[][] hasil = new int[barisA][kolomB];

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("matriks A: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriks B: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil matriks C: ");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
