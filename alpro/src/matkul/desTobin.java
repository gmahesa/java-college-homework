package matkul;

import java.util.Scanner;

public class desTobin
{
   public static void main(String[] args)
   {
      int desimal;
      String biner = "";
      Scanner input = new Scanner(System.in);
      System.out.print("masukkan angka desimal : ");
      desimal = input.nextInt();
      while(desimal > 0)
      {
         int y = desimal % 2;
         biner = y + biner;
         desimal = desimal / 2;
      }
      System.out.println("hasil konversi ke biner : " + biner);
   }
}