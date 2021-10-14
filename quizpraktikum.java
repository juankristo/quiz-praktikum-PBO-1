// juan kris 51019014

import java.util.Scanner;
public class quizpraktikum {
	
   public static void main (String args[]){
		
		
Scanner input = new Scanner(System.in);
	 
char merek,tipe;
String nama;
int harga=0 , bayar = 0, kembalian, totalharga, jumlahunit;
	
	 
System.out.println("Aplikasi Penghitung Penjualan");
System.out.println(); 
	 
System.out.print("Masukkan Nama anda : ");
nama = input.nextLine();
System.out.print("Masukkan Jumlah Unit : ");
jumlahunit = input.nextInt(); 
input.nextLine ();
		 
System.out.println("Merek yang tersedia: ");
System.out.println("G");
System.out.println("O");
System.out.println("Pilihan anda? ");
			
System.out.print("Masukkan Merek : ");
merek = input.next().charAt(0);
System.out.println(); 
	
		
		if (merek == 'G') {
			System.out.println("Dibawah ini adalah tipenya: ");
			System.out.println("Meja(M) - Rp.95,000");
			System.out.println("Kursi(K) - Rp.125,000");
			System.out.println("Lemari(L) - Rp.450,000");
			System.out.print("Pilihan anda? (Masukkan kode tipe) ");

			tipe = input.next().charAt(0); 
				if (tipe == 'M') {
					harga = 95000;
				} else
				if (tipe == 'K') {
					harga = 125000;
				} else
				if (tipe == 'L') {
					harga = 450000;
				} 
		} else
		
		if (merek == 'O') {
			System.out.println("Dibawah ini adalah tipenya: ");
			System.out.println("Meja(M) - Rp.115,000");
			System.out.println("Kursi(K) - Rp.135,000");
			System.out.println("Lemari(L) - Rp.5,505,000");
			System.out.print("Pilihan anda? (Masukkan kode tipe) : ");
			tipe = input.next().charAt(0);
			
				if (tipe == 'M') {
					harga = 115000;
				} else
				if (tipe == 'K') {
					harga = 135000;
				} else
				if (tipe == 'L') {
					harga = 5505000;
				} 
		}
		
totalharga = jumlahunit*harga;
System.out.println("Total Harga Anda :" + totalharga);
		
System.out.print("Masukkan Jumlah Uang anda :");
bayar = input.nextInt();
System.out.println();
		
kembalian = bayar-totalharga;
System.out.println("Nama anda :" + nama);
System.out.println("Total Harga anda :" + totalharga);
System.out.println("Pembayaran :" + bayar);
System.out.println("Kembalian :" + kembalian);
	 
	}
	
}