package matkul;

import java.util.Scanner;

public class integertobiner
{
   public static void main(String[] args)
   {
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter the a number : ");
      number = sc.nextInt(); 
      System.out.println("The Binary conversion is : " + Integer.toBinaryString(number)); 
      System.out.println("The number of 1 bits in " + number + " is : "+ Integer.bitCount(number));
      sc.close();
   }
}
