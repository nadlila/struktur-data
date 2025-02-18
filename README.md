import java.util.Scanner; [membaca input]

public class UAS1_1 { [agar bisa diakses dari mana saja]

    public static void main(String[] args) { [untuk java bisa mengeksekusi saat program dijalankan]
        Scanner input = new Scanner(System.in); [membaca input]
        String[] namaMahasiswa = new String[100]; [menyimpan teks]
        String[] nimMahasiswa = new String[100]; [menyimpan teks]
        String[] jenisPrestasi = new String[100]; [menyimpan teks]
        String[] tingkatPrestasi = new String[100]; [menyimpan teks]
        int[] tahunPrestasi = new int[100]; [menyimpan bilangan bulat]
        int prestasiCount = 0; [menyimpan bilangan bulat]
        int choice; [menyimpan pilihan dari user]
        do { [memilih menu]
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ==="); [menampilkan menu]
            System.out.println("1. Tambah Prestasi Mahasiswa"); [menampilkan menu]
            System.out.println("2. Tampilkan Daftar Prestasi"); [menampilkan menu]
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis"); [menampilkan menu]
            System.out.println("4. Keluar"); [menampilkan menu]
            System.out.print("Pilih menu: "); [menampilkan menu]
            choice = input.nextInt(); [menyimpan pilihan]
            input.nextLine(); [membaca seluruh baris]
            switch (choice) { [melakukan pemilihan yang sesuai]
                case 1: [salah satu pemilihan]
                if (prestasiCount >= 100) {  [memastikan prestasi tidak lebih dari 100]
                    System.out.println("Jumlah prestasi telah mencapai batas maksimal."); [menampilkan]
                    break; [menghentikan eksekusi dalam switch]
                    } 

                    System.out.print("Nama Mahasiswa: "); [menampilkan pertanyaan]
                    namaMahasiswa[prestasiCount] = input.nextLine(); [menampilkan baris yang sudah dijawab] 
                    System.out.print("NIM: "); [menampilkan pertanyaan]
                    nimMahasiswa[prestasiCount] = input.nextLine(); [menampilkan baris yang sudah dijawab]
                    System.out.print("Jenis Prestasi: "); [menampilkan pertanyaan]
                    jenisPrestasi[prestasiCount] = input.nextLine(); [menampilkan baris yang sudah dijawab] 
                    while (true) { [memastikan loop terus berjalan sampai user memilih opsi yang valid]
                        System.out.print("Tingkat Prestasi (Lokal, Nasional, Internasional): "); [menampilkan pilihan] 
                        tingkatPrestasi[prestasiCount] = input.nextLine(); [menampilkan baris yang sudah dipilih]
                        if (tingkatPrestasi[prestasiCount].equalsIgnoreCase("Lokal") || [pemilihan if tanpa memedulikan perbedaan kapital dan spasi]
                        tingkatPrestasi[prestasiCount].equalsIgnoreCase("Nasional") || [pemilihan]
                        tingkatPrestasi[prestasiCount].equalsIgnoreCase("Internasional")) { [pemilihan]
                            break; [menghentikan eksekusi] 
                        } else { [jika kondisi tidak terpenuhi, ]
                            System.out.println("Input tidak valid. Harap masukkan salah satu dari: Lokal, Nasional, Internasional."); [maka muncul kalimat tersebut]
                        } 
                    }
                    while (true) { [memastikan loop terus berjalan sampai user memilih opsi yang valid]
                        System.out.print("Tahun Prestasi (2010 hingga tahun saat ini): ");  [menampilkan pilihan]
                        int tahun = input.nextInt(); [menyimpan bilangan bulat]
                        input.nextLine(); [membaca seluruh baris]
                        if (tahun >= 2010 && tahun <= 2024) { [pemilihan dengan if]
                            tahunPrestasi[prestasiCount] = tahun; [menampilkan jawaban]
                            break; [menghentikan eksekusi]
                        } else { [jika kondisi tidak terpenuhi]
                            System.out.println("Input tidak valid. Harap masukkan tahun antara 2010 hingga tahun saat ini."); [maka muncul kalimat tersebut]
                        } 
                    }

                    prestasiCount++; [menghitung jumlah yang sudah ditambahkan]
                    System.out.println("Prestasi berhasil ditambahkan!"); [menampilkan jumlahnya]
                    break; [menghentikan eksekusi]
                case 2: [salah satu pemilihan]
                if (prestasiCount > 0) { [memastikan prestasi lebih dari 0]
                    System.out.println("=== DAFTAR SEMUA PRESTASI ==="); [menampilkan menu]
                    for (int i = 0; i < prestasiCount; i++) { [perulangan untuk mengeksekusi berdasarkan kondisi tertentu]
                        System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Jenis: " + jenisPrestasi[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); [menampilkan yang sudah dipilih tadi]
                    }
                } else { [jika kondisi tidak terpenuhi]
                    System.out.println("belum ada data prestasi");
                }                  
                    break;
                case 3:
                System.out.print("Masukkan jenis prestasi yang ingin dianalisis: "); 
                String jenis = input.nextLine(); 
                System.out.println("=== ANALSIS PRESTASI ==="); 
                for (int i = 0; i < prestasiCount; i++) { 
                    if (jenisPrestasi[i].equalsIgnoreCase(jenis)) { 
                        System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
                    } 
                }
                    break;
                case 4: 
                    System.out.println("Terima kasih!"); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);
    }
}
           