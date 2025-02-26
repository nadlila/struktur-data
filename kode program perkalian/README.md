public class perkalian_matriks { [mendeklarasikan metode main untuk mengeksekusi program]

    public static void main(String[] args) { [untuk java bisa mengeksekusi ketika program dijalankan]
        int [][] a = { [matriks dengan ukuran 2*3]
            {4, 5, 6},
            {7, 8, 9}
        };

        int [][] b = { [matriks dengan ukuran 3*2]
            {10, 11},
            {12, 13},
            {14, 15}
        };

        int barisA = a.length; [menyimpan jumlah baris a]
        int kolomA = a[0].length; [menyimpan jumlah kolom a]
        int kolomB = b[0].length; [menyimpan jumlah kolom b]
        int[][] hasil = new int[barisA][kolomB]; [membuat matriks ukuran 2*2]

        for (int i = 0; i < barisA; i++) { [mengiterasi tiap baris a]
            for (int j = 0; j < kolomB; j++) { [mengiterasi tiap kolom b]
                for (int k = 0; k < kolomA; k++) { [mengiterasi tiap kolom a]
                    hasil[i][j] += a[i][k] * b[k][j]; [menghitung]
                }
            }
        }

        System.out.println("matriks A: "); [menampilkan matriks a]
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriks B: "); [menampilkan isi matriks b]
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil matriks C: "); [menampilkan hasil perkalian matriks]
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
