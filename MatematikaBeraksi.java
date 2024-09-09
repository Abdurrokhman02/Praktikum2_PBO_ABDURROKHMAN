/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author Abdurrokhman
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika mtk = new Matematika();
        
        int hasilTambah = mtk.pertambahan(20, 10);
        int hasilKurang = mtk.pengurangan(10, 5);
        int hasilKali = mtk.perkalian(10, 3);
        int hasilBagi = mtk.pembagian(21, 2);
        
        System.out.println("Pertambahan: 20 + 10 = "+ hasilTambah);
        System.out.println("Pengurangan: 10 + 5 = "+ hasilKurang);
        System.out.println("Perkalian: 10 + 3 = "+ hasilKali);
        System.out.println("Pembagian: 21 + 2 = "+ hasilBagi);
    }
}
