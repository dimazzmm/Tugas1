public class ArrayGenap {
    public static void main(String[] args) {
        // 1. Membuat array dengan 10 bilangan bulat
        int[] arr = new int[10];
        
        // 2. Mengisi array dengan bilangan genap mulai dari 2
        int angka = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = angka;
            angka += 2; // menambah 2 untuk bilangan genap berikutnya
        }

        // 3. Menampilkan isi array
        System.out.println("Isi array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // untuk newline setelah menampilkan array

        // 4. Menghitung jumlah semua elemen array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Jumlah semua elemen array: " + sum);
    }
}
