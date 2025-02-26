public class diagonal_utama_samping {

    public static void main(String[] args) {
        int[][] matriks = {
            {4, 2, 6},
            {7, 5, 3},
            {10, 8, 9}
        };

        System.out.println("diagonal utama matriks: ");
        for (int i = 0; i < matriks.length; i++) {
            System.out.print(matriks[i][i] + " ");
        }

        System.out.println("\ndiagonal samping matriks: ");
        for (int i = 0; i < matriks.length; i++) {
            System.out.print(matriks[i][matriks.length - 1 - i] + " ");
        }
    }
}