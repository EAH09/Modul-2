/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.util.Scanner;

/**
 *
 * @author erisa
 */
public class LuasSegitiga {
    public static void main(String[] args){
        int alas, tinggi;
        double luas;
        
        Scanner input = new Scanner(System.in);
        
        

        System.out.println(">> Program Hitung Luas Segitigs >>");
        System.out.print("Input alas: ");
        alas = input.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = input.nextInt();
        
        luas= Double.valueOf((alas*tinggi)/2);
        

        System.out.println ("Luas: "+luas);
        
    }
    
}
