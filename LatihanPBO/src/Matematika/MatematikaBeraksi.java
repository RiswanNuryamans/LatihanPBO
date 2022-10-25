/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematika mtk = new Matematika();
        
        mtk.pertambahan(20, 20);
        mtk.pengurangan(10, 5);
        mtk.perkalian(10, 20);
        mtk.pembagian(21, 2);
        
        System.out.println("=================");
        MatematikaCanggih mtc = new MatematikaCanggih();
        mtc.pertambahan(12.5, 28.7, 14.2);
        mtc.pertambahan(23, 34);
        mtc.pertambahan(12, 28, 14);
        mtc.pertambahan(3.4, 4.9);
    }
    
}
