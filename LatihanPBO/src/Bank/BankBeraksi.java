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
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bank b = new Bank();
        
        System.out.println("Selamat Datang di Bank ABC");
        b.getSaldo();
        b.simpanUang(500000);
        b.ambilUang(150000);
    }
    
}
