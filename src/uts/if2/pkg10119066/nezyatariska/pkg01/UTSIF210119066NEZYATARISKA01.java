/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119066.nezyatariska.pkg01;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * NIM      : 10119066
 */
public class UTSIF210119066NEZYATARISKA01 {
    public static int yearNow;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        System.out.print("Masukkan tahun lahir anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun   : " + age.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
    
}
