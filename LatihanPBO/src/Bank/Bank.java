/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
    
    void simpanUang(int s){
        saldo = saldo + s;
        System.out.println("Simpan uang : Rp." + s);
        getSaldo();
    }
    void ambilUang(int s){
        saldo = saldo - s;
        System.out.println("Ambil uang : Rp." + s);
        getSaldo();
    }
    void getSaldo(){
        System.out.println("Saldo saat ini : Rp." + saldo);
    }
}
