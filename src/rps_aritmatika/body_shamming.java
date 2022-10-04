package rps_aritmatika;

import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class body_shamming
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//deklarasi
		double tinggiBadan, bb_ideal;
		
		//input
		System.out.println("Masukkan Nilai Tinggi Badan Anda Bre = " );
		tinggiBadan = scan.nextDouble();

		//proses
		bb_ideal = (tinggiBadan - 100) - (0.1*(tinggiBadan - 100));
		
		//output
		System.out.println("Berat Badan Ideal Anda adalah = " + bb_ideal + " kg");
	}
}
