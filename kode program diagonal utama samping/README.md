public class diagonal_utama_samping { [mendeklarasikan metode main untuk menheksekusi program]

    public static void main(String[] args) { [untuk java bisa mengeksekusi program ketika dijalankan]
        int[][] matriks = { [matriks dengan ukuran 3*3]
            {4, 2, 6},
            {7, 5, 3},
            {10, 8, 9}
        };

        System.out.println("diagonal utama matriks: "); [menampilkan teks]
        for (int i = 0; i < matriks.length; i++) { [mengiterasi elemen2 diagonal utama]
            System.out.print(matriks[i][i] + " "); [mengeksekusi elemen baris dan kolom yang sama]
        }

        System.out.println("\ndiagonal samping matriks: "); [menampilkan teks]
        for (int i = 0; i < matriks.length; i++) { [mengiterasi elemen2 diagoal samping]
            System.out.print(matriks[i][matriks.length - 1 - i] + " "); [dimulai dari pojok kanan atas ke kiri bawah]
        }
    }
}