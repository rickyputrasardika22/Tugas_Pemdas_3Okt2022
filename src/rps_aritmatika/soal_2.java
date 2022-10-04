package rps_aritmatika;

import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class soal_2 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		int v, t;
		double s;
		
		//input
		System.out.println("Masukkan Nilai v = " );
		v = scan.nextInt();
		System.out.println("Masukkan Nilai t = " );
		t = scan.nextInt();
		
		//proses
		s = v*t;
		
		//output
		System.out.println("Jadi, dengan kecepatan " + v + " km" + " dan waktu " + t + " jam" + " maka jarak yang dihasilkan adalah " + s + " km/jam");
	}
}
