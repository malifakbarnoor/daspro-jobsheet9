import java.util.Scanner;
public class ArrayNilai13 {
    public static void main(String[] args) {
         int [] nilaiAkhir= new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        int i = 0;
        for(int nilai : nilaiAkhir) {
            if (nilai > 70) {
            String status =  "LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            }
            i++;

        }
       
    }
}
