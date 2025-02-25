public class permainan_tictactoe { [mendeklarasikan kelas]

    public static void main(String[] args) { [mendeklarasikan metode main untuk mengeksekusi program]
    
        char[][] papan = new char[3][3]; [membuat array 2 dimensi berukuran 3*3, berisi karakter]

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) { [menggunakan nested loop]
            for (int j = 0; j < 3; j++) { [nested loop]
                papan[i][j] = '-'; [posisi papan diisi dengan karakter '-']
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X'; [pojok kiri atas berisi 'X']
        papan[1][1] = 'O'; [tengah papan berisi 'O']
        papan[2][2] = 'X'; [pojok kanan bawah berisi 'X']

        // Tampilkan papan
        System.out.println("Status Papan:"); [menampilkan teks]
        tampilkanPapan(papan); [mencetak papan ke layar]
    }

    public static void tampilkanPapan(char[][] papan) { [mendeklarasikan metode, array 2D, mencetak status papan ke layar]
        for (int i = 0; i < 3; i++) { [iterasi melalui baris papan permainan]
            for (int j = 0; j < 3; j++) { [iterasi melalui kolom dalam tiap baris]
                System.out.print(papan[i][j] + " "); [menampilkan teks]
            }
            System.out.println(); [pindah baris baru tiap baris papan selesai]
        }
    }
}
