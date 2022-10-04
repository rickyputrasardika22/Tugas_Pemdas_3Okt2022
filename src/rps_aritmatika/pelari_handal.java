package rps_aritmatika;

import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class pelari_handal
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		int jam, menit, detik, totalDetik;
		
		//input
		System.out.println("Masukkan Nilai Jam = " );
		jam = scan.nextInt();
		System.out.println("Masukkan Nilai Menit = " );
		menit = scan.nextInt();
		System.out.println("Masukkan Nilai Detik = " );
		detik = scan.nextInt();
		
		//proses
		totalDetik = (jam*3600) + (menit*60) + detik;
		
		//output
		System.out.println("Nilai Total Detik adalah = " + totalDetik + " detik");
	}
}
