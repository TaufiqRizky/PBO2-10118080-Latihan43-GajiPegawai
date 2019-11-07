/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gj = new GajiPegawai();
        System.out.print("Nama Karyawan\t: ");
        Scanner nm = new Scanner(System.in);
        gj.setNama(nm.nextLine());
        System.out.print("Alamat \t\t: ");
        Scanner alm = new Scanner(System.in);
        gj.setAlamat(alm.nextLine());
        System.out.print("Uang Transport \t: ");
        Scanner ut = new Scanner(System.in);
        gj.setUangTransport(ut.nextInt());
        System.out.print("Uang Tunjangan \t: ");
        Scanner utunj = new Scanner(System.in);
        gj.setUangTunjangan(utunj.nextInt());
        System.out.print("Gaji Pokok \t: ");
        Scanner gp = new Scanner(System.in);
        gj.setGajiPokok(gp.nextInt());
        int tot = gj.totalGaji(gj.getUangTunjangan(), gj.getUangTransport(), gj.getGajiPokok());
        System.out.println("");
        System.out.println("");
        gj.tampilData(gj.getNama(), gj.getAlamat(),gj.getUangTunjangan(), gj.getUangTransport(),gj.getGajiPokok(), tot);
    }
    
}
