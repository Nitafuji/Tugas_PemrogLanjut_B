/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_atm;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tampilan {
   Scanner scanner = new Scanner(System.in);
     public int menuUtama(){
          System.out.println("=======================");
          System.out.println("WELCOME TO MENU ATM ");
          System.out.println("=======================");
          System.out.println("1. Cek Saldo");
          System.out.println("2. Tarik Tunai");
          System.out.println("3. Setor Tunai");
          System.out.println("4. Exit");
          System.out.println("------------------------");
          System.out.println("Pilih : ");
    
    return scanner.nextInt();
    }
    
    
    public void lihatSaldo(Model CekSaldo){
        System.out.println("\n Saldo Anda Rp." +CekSaldo.lihatSaldo.getjumlahSaldo());
    }
    
    public void tarikTunai(Model CekSaldo){
        int jumlah;
        System.out.print("Masukkan penarikan (kelipatan 50.000) : Rp");
        jumlah = scanner.nextInt();
        
        if(CekSaldo.makSimal()){
            System.out.println("\nSaldo Anda Mencapai Limit");  
        }
        else if((CekSaldo.getjumlahSaldo() - jumlah) < CekSaldo.maksimal()){
        System.out.println("\n Penarikan limit");
        }
        else if((CekSaldo.getjumlahSaldo() > jumlah) && (CekSaldo.cekTransaksi(jumlah) == 0)){
            CekSaldo.kurangSaldo(jumlah);
            System.out.println("\n Uang telah berhasil ditarik  Rp" + jumlah);
        }
        else{
        System.out.println("Harus kelipatan 50.000");
        }     
      }
    
    public void setorTunai(Model CekSaldo){
        int jumlah;
        System.out.print("Masukkan jumlah setoran (kelipatan 50.000) : Rp");
        jumlah = scanner.nextInt();
        
        if(CekSaldo.cekTransaksi (jumlah) == 0){
            CekSaldo.tambahSaldo(jumlah);
            System.out.println("Saldo berhasil ditambahkan : Rp." + jumlah);
        }
        else{
        System.out.println("Harus kelipatan 50.000");
        }     
      }
        
}
