/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Hitungbop {

    static String nik ; 
    static String nama ;
    static int gol, pokok, kehadiran, bulan, potongan, totbayar;
    
    public static String email(String email){
        
        if(email.equals("Hitungbop@gmail.com")){
        }
        else if(!email.equals("Hitungbop@gmail.com")){
            System.out.println("Gagal login");
            System.exit(0);
        }
        
        return email;
    }
    
    public static String password(String pass){
        
        if(pass.equals("beasiswa")){
            System.out.println("");
            System.out.println("--Berhasil login--");
        }
        else if(!pass.equals("beasiswa")){
            System.out.println("Gagal login");
            System.exit(0);
        }
        
        return pass;
    }

    public static int getGol() {
        return gol;
    }

    public static void setGol(int gol) {
        Hitungbop.gol = gol;
    }

    public static int getBulan() {
        return bulan;
    }

    public static void setBulan(int bulan) {
        Hitungbop.bulan = bulan;
    }
    
    public int hitungpotongan(int bulan){
    int ptg = bulan*50000;
    System.out.println("potongan adalah : "+ptg);
    return ptg;
    
}
    public int hitungbeasiswa(int pokok, int potongan){
      int beasiswa = pokok-potongan ;
      System.out.println("Pembayaran adalah :"+beasiswa);
      return beasiswa;
      
  }
    
    public int checkgol (int gol, int potongan){
       
       if (gol == 1) 
  {
   pokok = 500000;
   totbayar = hitungbeasiswa (pokok, potongan); 
   
   System.out.println("Bayar Pokok\t\t\t= "+pokok);
   System.out.println("Potongan Perbulan = "+potongan);
   System.out.println("==================================");
   System.out.println("Total Bayar\t\t\t= "+totbayar);
   System.out.println("==================================");
  }
  else if (gol == 2) 
  {
   pokok = 1000000;
   totbayar = hitungbeasiswa (pokok, potongan);
   System.out.println("Bayar Pokok\t\t\t= "+pokok);
   System.out.println("Potongan Perbulan = "+potongan);
   System.out.println("==================================");
   System.out.println("Total Bayar\t\t\t= "+totbayar);
   System.out.println("==================================");
  }
  else if (gol == 3) 
  {
   pokok = 2000000;
   totbayar = hitungbeasiswa (pokok, potongan);
   System.out.println("Bayar Pokok\t\t\t= "+pokok);
   System.out.println("Potongan Perbulan = "+potongan);
   System.out.println("==================================");
   System.out.println("Total Bayar\t\t\t= "+totbayar);
   System.out.println("==================================");
  }
  else if (gol == 4) 
  {
   pokok = 3000000;
   totbayar = hitungbeasiswa (pokok, potongan);
   System.out.println("Bayar Pokok\t\t\t= "+pokok);
   System.out.println("Potongan Perbulan = "+potongan);
   System.out.println("==================================");
   System.out.println("Total Bayar\t\t\t= "+totbayar);
   System.out.println("==================================");
  }
  else
  {
   System.out.println("Golongan\t\t\t= Golongan Salah !!");
  }
       return totbayar;
  } 
    
    public static void main(String[] args) {
    String email, pass;
    Hitungbop hb = new Hitungbop ();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter email: ");
    email = sc.nextLine();
    Hitungbop.email(email);
    
    System.out.print("enter pass: ");
    pass = sc.nextLine();
    Hitungbop.password(pass);
    
    System.out.print("enter nik: ");
    nik = sc.nextLine();
    
    System.out.print("enter nama: ");
    nama = sc.nextLine();
    
    System.out.print("enter bulan: ");
    bulan = sc.nextInt();
    
    System.out.print("enter gol: ");
    gol = sc.nextInt();
    potongan = hb.hitungpotongan(bulan);


  System.out.println("NIK \t\t\t\t= "+nik);
  System.out.println("Nama\t\t\t\t= "+nama);
  System.out.println("Bulan\t\t\t= "+bulan);

System.out.println("Transaksi Berhasil");	  


int bayar = hb.checkgol(gol, potongan);
    }
    
}
