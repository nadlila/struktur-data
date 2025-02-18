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

                    System.out.print("Nama Mahasiswa: "); [menampilkan]
                    namaMahasiswa[prestasiCount] = input.nextLine(); [menampilkan seluruh baris] 
                    System.out.print("NIM: "); [menampilkan]
                    nimMahasiswa[prestasiCount] = input.nextLine(); [menampilkan seluruh baris]
                    System.out.print("Jenis Prestasi: "); [menampilkan]
                    jenisPrestasi[prestasiCount] = input.nextLine(); [menampilkan seluruh baris] 
                    while (true) { [memastikan loop terus berjalan sampai user memilih opsi yang valid]
                        System.out.print("Tingkat Prestasi (Lokal, Nasional, Internasional): "); 
                        tingkatPrestasi[prestasiCount] = input.nextLine(); 
                        if (tingkatPrestasi[prestasiCount].equalsIgnoreCase("Lokal") || 
                        tingkatPrestasi[prestasiCount].equalsIgnoreCase("Nasional") || 
                        tingkatPrestasi[prestasiCount].equalsIgnoreCase("Internasional")) {
                            break; 
                        } else { 
                            System.out.println("Input tidak valid. Harap masukkan salah satu dari: Lokal, Nasional, Internasional."); 
                        } 
                    }
                    while (true) { 
                        System.out.print("Tahun Prestasi (2010 hingga tahun saat ini): "); 
                        int tahun = input.nextInt(); 
                        input.nextLine(); 
                        if (tahun >= 2010 && tahun <= 2024) { 
                            tahunPrestasi[prestasiCount] = tahun; 
                            break; 
                        } else { 
                            System.out.println("Input tidak valid. Harap masukkan tahun antara 2010 hingga tahun saat ini."); 
                        } 
                    }

                    prestasiCount++; 
                    System.out.println("Prestasi berhasil ditambahkan!");
                    break;
                case 2:
                if (prestasiCount > 0) {
                    System.out.println("=== DAFTAR SEMUA PRESTASI ==="); 
                    for (int i = 0; i < prestasiCount; i++) { 
                        System.out.println("Nama: " + namaMahasiswa[i] + "| NIM: " + nimMahasiswa[i] + "| Jenis: " + jenisPrestasi[i] + "| Tingkat: " + tingkatPrestasi[i] + "| Tahun: " + tahunPrestasi[i]); 
                    }
                } else {
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
           