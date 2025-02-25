public class sistem_nilai_manajemen { [mendeklarasikan metode main untuk mengeksekusi program]
    public static void main(String[] args) { [untuk java bisa mengeksekusi saat program dijalankan]
        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"}; [menyimpan teks berupa nama]
        int[][] nilai = { [menyimpan bilangan bulat]
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; [menyimpan teks berupa mapel]

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:"); [menampilkan teks]
        for (int i = 0; i < nilai.length; i++) { [perulangan untuk setiap siswa, dengan jumlah siswa dalam array nilai]
            double total = 0; [menginisialisasi total dengan nilai nol]
            for (int n : nilai[i]) { [perulangan untuk setiap nilai dalam array, mengambil nilai satu persatu]
                total += n; [menambahkan nilai dari siswa ke variabel total]
            }
            double rataSiswa = total / nilai[i].length; [menghitung rata2 nilai yang telah dikumpulkan]
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa); [menampilkan nama siswa dan rata2 nilai mereka dengan format 2 angka di belakang koma]
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:"); [ menampilkan teks]
        for (int j = 0; j < nilai[0].length; j++) { [perulangan untuk setiap mata pelajaran]
            double total = 0; [menginisialisasi total dengan nilai nol]
            for (int i = 0; i < nilai.length; i++) { [perulangan untuk setiap siswa dan menjumlahkan nilai siswa pada mata pelajaran]
                total += nilai[i][j]; [menambahkan nilai siswa dalam mata pelajaran ke dalam total]
            }
            double rataMapel = total / nilai.length; [menghitung rata2 nilai mata pelajaran]
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel); [menampilkan nama mapel dan rata2 nilainya]
        }
    }
}
