package Gajian;

import java.util.Scanner;

public class Gaji 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//deklarasi
		double gaji_bersih, gaji_pokok, pajak, tunjangan, hasil_tunjangan;
		String nama_karyawan;
		
		//input
		System.out.print("Masukkan Nama Karyawan = " );
		nama_karyawan = scan.nextLine();							//tipe data string pakai nextLine
		System.out.print("Masukkan Gaji Pokok Karyawan = Rp. " );
		gaji_pokok = scan.nextDouble();
		
		//proses
		tunjangan = 0.2 * gaji_pokok;								// tunjangan = 20% dari gaji pokok
 		hasil_tunjangan = gaji_pokok + tunjangan;					// tunjangan yang didapat
 		
		
 		pajak = 0.025 * (gaji_pokok + hasil_tunjangan);				// pajak = 25% dari (gaji pokok + tunjangan)
 		
 		gaji_bersih = gaji_pokok + hasil_tunjangan - pajak;
 		
 		//output
 		System.out.println("Tunjangan Karyawan Tersebut Adalah Rp. " + hasil_tunjangan);
 		System.out.println("Pajak Karyawan Tersebut Rp. " + pajak);
 		System.out.println("Gaji Bersih Yang Didapat Karyawan Selama Sebulan Sebesar Rp. " + gaji_bersih);
		
	}
}
