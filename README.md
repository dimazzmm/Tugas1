Program ini adalah sebuah aplikasi sederhana untuk mengelola pesanan di sebuah kafe menggunakan bahasa pemrograman Java. Aplikasi ini memungkinkan pengguna untuk memilih menu makanan dan minuman, menambahkan pesanan, melihat daftar pesanan, menghitung total biaya, dan akhirnya menyelesaikan transaksi. Berikut adalah penjelasan rinci mengenai kode tersebut:

1. Deklarasi Variabel dan Struktur Data
String[] menuNama: Array yang menyimpan nama-nama menu yang tersedia di kafe. Di sini, terdapat 7 menu yang terdiri dari makanan dan minuman.
int[] menuHarga: Array yang menyimpan harga masing-masing menu yang sesuai dengan urutan di menuNama. Misalnya, harga untuk "Nasi Goreng" adalah 20.000.
ArrayList<String> pesananNama: Sebuah ArrayList yang menyimpan nama menu yang dipesan oleh pelanggan.
ArrayList<Integer> pesananJumlah: Sebuah ArrayList yang menyimpan jumlah masing-masing menu yang dipesan.
ArrayList<Integer> pesananHarga: Sebuah ArrayList yang menyimpan harga masing-masing menu yang dipesan. Harga ini digunakan untuk menghitung total biaya pesanan.

2. Menampilkan Menu Awal
Program akan mencetak daftar menu yang tersedia beserta harganya pada awal eksekusi program dengan menggunakan for loop untuk iterasi melalui array menuNama dan menuHarga.

3. Menu Utama (Pilihan Pengguna)
Program menampilkan pilihan utama dengan 4 opsi:
Tambah Pesanan: Untuk menambahkan menu dan jumlah pesanan.
Lihat Daftar Pesanan: Untuk melihat daftar pesanan yang telah ditambahkan.
Hitung Total Biaya: Untuk menghitung total biaya pesanan yang telah dimasukkan.
Selesai: Untuk keluar dari program.
Program kemudian meminta pengguna untuk memilih opsi yang diinginkan dengan membaca input dari pengguna menggunakan Scanner.

4. Opsi 1: Tambah Pesanan
Pengguna diminta untuk memasukkan nomor menu yang ingin dipesan. Program memeriksa apakah nomor menu valid (antara 1 dan jumlah menu yang tersedia).
Setelah nomor menu yang valid dimasukkan, program meminta pengguna untuk memasukkan jumlah pesanan.
Jika jumlah pesanan lebih dari 0, menu yang dipilih beserta jumlahnya ditambahkan ke dalam ArrayList yang sesuai (pesananNama, pesananJumlah, dan pesananHarga).
Jika nomor menu tidak valid atau jumlah pesanan kurang dari 1, pesan error akan muncul, dan program akan kembali ke menu utama.

5. Opsi 2: Lihat Daftar Pesanan
Program akan menampilkan daftar pesanan yang telah dimasukkan oleh pengguna, termasuk nama menu dan jumlah pesanan.
Jika belum ada pesanan yang dimasukkan, akan ditampilkan pesan bahwa belum ada pesanan.

6. Opsi 3: Hitung Total Biaya
Program menghitung total biaya pesanan dengan menjumlahkan harga masing-masing item yang dipesan, dikalikan dengan jumlahnya. Hasil total ditampilkan kepada pengguna.

7. Opsi 4: Selesai
Jika pengguna memilih opsi ini, program akan mencetak pesan "Terima kasih telah berkunjung ke kafe kami!" dan menghentikan eksekusi program dengan mengubah nilai isRunning menjadi false.

8. Looping dan Validasi Input
Program menggunakan while (isRunning) untuk menjaga aplikasi tetap berjalan hingga pengguna memilih untuk selesai (pilihan 4).
Program juga memastikan input dari pengguna valid pada setiap langkah (misalnya, mengecek nomor menu yang valid dan jumlah pesanan yang positif).

9. Penutupan Scanner
Di akhir program, user.close() digunakan untuk menutup objek Scanner dan melepaskan sumber daya yang digunakan.

Kesimpulan
Program ini adalah contoh aplikasi sederhana untuk mengelola pesanan di sebuah kafe. Fitur-fitur utama yang dimilikinya antara lain:
Menambahkan pesanan.
Menampilkan daftar pesanan.
Menghitung total biaya pesanan.
Menghentikan program setelah selesai.
Program ini menggunakan array dan ArrayList untuk menyimpan data, serta menyediakan interface berbasis teks untuk interaksi pengguna.