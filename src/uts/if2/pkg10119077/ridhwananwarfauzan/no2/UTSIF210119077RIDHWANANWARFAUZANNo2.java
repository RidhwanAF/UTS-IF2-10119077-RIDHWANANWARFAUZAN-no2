/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119077.ridhwananwarfauzan.no2;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF-2
 * Deskripsi    : Menghasilkan saldo uang
 */
public class UTSIF210119077RIDHWANANWARFAUZANNo2 {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jumlah;
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan objTabungan=new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = objTabungan.ambilUang(input.nextInt());
        System.out.println("Saldo Anda Sekarang : "+jumlah);
        
    }
    
}
