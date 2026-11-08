import java.util.Scanner;
public class nilaiMahasiswa13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jmlMahasiswa = sc.nextInt();
    double total = 0;
    double rata2 = 0;
    int[] nilai = new int[jmlMahasiswa];

    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai[i] = sc.nextInt();
        total += nilai[i];
    }

    int tertinggi = nilai[0];
    int terendah = nilai[0];
    for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] > tertinggi) tertinggi = nilai[i];
        if (nilai[i] < terendah) terendah = nilai[i];
    }

    
    for (int i = 0; i < nilai.length; i++) { 
        String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS"; 
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")"); 

    }
    rata2 = total / jmlMahasiswa;
    System.out.println("Rata-rata kelas adalah: " + rata2);
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
   }
}
