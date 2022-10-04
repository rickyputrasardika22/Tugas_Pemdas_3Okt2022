package rps_aritmatika;

import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class pertukaran_cawan
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		int a, b, c;
		
		//input
		System.out.println("Masukkan Nilai a = " );
		a = scan.nextInt();
		System.out.println("Masukkan Nilai b = " );
		b = scan.nextInt();
		
		//proses
		c = a;
		a = b;
		b = c;	
		
		//output
		System.out.println("Nilai A Sekarang = " + a);
		System.out.println("Nilai B Sekarang = " + b);
	}
}
