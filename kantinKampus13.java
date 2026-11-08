import java.util.Scanner;
public class kantinKampus13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

         System.out.println("====== DAFTAR MENU KAFE KAMPUS ======");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-15s : Rp %,d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("=====================================\n");

        System.out.print("Masukkan jumlah item menu yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananHarga = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean menuDitemukan = false;
            String menuDicari = "";
            int indeksDitemukan = -1;

            
            while (!menuDitemukan) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                menuDicari = sc.nextLine();

                
                for (int j = 0; j < menu.length; j++) {
                    
                    if (menu[j].equalsIgnoreCase(menuDicari)) {
                        menuDitemukan = true;
                        indeksDitemukan = j;
                        break; 
                    }
                }

                
                if (menuDitemukan) {
                    System.out.println("-> Berhasil ditambahkan: " + menu[indeksDitemukan] + " (Rp " + harga[indeksDitemukan] + ")");
                    // Simpan ke array pesanan
                    pesananNama[i] = menu[indeksDitemukan];
                    pesananHarga[i] = harga[indeksDitemukan];
                } else {
                    System.out.println("[Error] Menu \"" + menuDicari + "\" tidak tersedia. Silakan coba lagi!\n");
                }
            }
            System.out.println(); // Baris baru untuk estetika
        }

        int totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += pesananHarga[i];
        }

        System.out.println("          NOTA PESANAN KAFE          ");
       
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s : Rp %,d\n", pesananNama[i], pesananHarga[i]);
        }
        System.out.printf("%-20s : Rp %,d\n", "TOTAL BIAYA", totalBiaya);
        System.out.println("    Terima Kasih Atas Kunjungan Anda   ");
        

        sc.close();
    }
}

    

