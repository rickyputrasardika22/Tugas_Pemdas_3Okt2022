package rps_aritmatika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rps_aritmatika 
{
	public static void main(String [] args) throws NumberFormatException, IOException
	{
		//deklarasi
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x;
		int a,b,c;
		
		//input
		System.out.println("Masukkan Nilai a = " );
		a = Integer.parseInt(br.readLine());
		System.out.println("Masukkan Nilai b = " );
		b = Integer.parseInt(br.readLine());
		System.out.println("Masukkan Nilai c = " );
		c = Integer.parseInt(br.readLine());
		
		//proses
		x = (-b + (2*c*c) + (4*a*b)) / (2*c);
		
		//output
		System.out.println("Nilai x = " + x);
		
	}
}
