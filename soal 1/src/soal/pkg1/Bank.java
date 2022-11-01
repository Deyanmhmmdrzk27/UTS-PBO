/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.pkg1;

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
    public void simpanUang (int jumlah) {
        saldo += jumlah;
        System.out.println("Ambil Uang : Rp." + jumlah);
        getsaldo();
        
        }
public void ambilUang (int jumlah) {
    System.out.println("Ambil uang : Rp. + jumlah");
    if(saldo >= jumlah) {
        saldo -= jumlah;
        getsaldo();
    }else {
        System.out.println("Saldo Tidak Cukup");
        getsaldo();
        
    }        
    }
public void getsaldo (){
    System.out.println("Sisa saldo saat ini: Rp." +saldo);
}
}
