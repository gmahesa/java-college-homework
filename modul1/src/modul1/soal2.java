package modul1;

import java.util.Scanner;

public class soal2 {

	public static void main(String[] args) {
		int angka;
		int temp;
		boolean prima = true;
		 
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan angka: ");
		angka = input.nextInt();
		for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
		   
		 temp = angka % pembagi;
		   
		 if(temp == 0){
		    
		  prima = false;
		  break;
		    
		  }
		  
		 }
		if(prima && ((angka > 0)&&(angka != 1)))
		 System.out.println(angka + " adalah bilangan prima");
		else
		 System.out.println(angka + " bukanlah bilangan prima");
		       
	}
}