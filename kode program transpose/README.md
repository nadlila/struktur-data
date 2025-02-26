public class transpose_matriks { [mendeklarasikan metode main untuk menheksekusi program]

    public static void main(String[] args) { [untuk java bisa mengeksekusi program ketika dijalankan]
        int[][] matriks = { [matriks dengan ukuran 3*3]
            {3, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };

        int baris = matriks.length; [menhgitung jumlah baris di matriks]
        int kolom = matriks[0].length; [menghitung jumlah kolom]
        int[][] transpose = new int[kolom][baris]; [membuat matriks tranpose dengan ukuran baris*kolom untuk menyimpan hasil]

        for (int i = 0; i < baris; i++) { [mengiterasi setiap baris]
            for (int j = 0; j < kolom; j++) { [mengiterasi setiap kolom]
                transpose[j][i] = matriks[i][j]; [menukar posisi elemen baris menjadi kolom dan kolom menjadi baris]
            }
        }

        System.out.println("Matriks Awal: "); [menampilkan isi matriks]
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTranspose Matriks: "); [menampilkan isi transpose]
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}