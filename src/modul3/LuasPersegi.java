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
public class LuasPersegi {
    public static void main (String[] args){
        int panjang, lebar;
        Double luas;
        
        Scanner input = new Scanner (System.in);
 
        System.out.println("<< Program Hitung Luas Persegi >>" );
        System.out.println("input panjang: ");
        panjang = input.nextInt();
        System.out.println("input lebar: ");
        lebar = input.nextInt();
        
        luas = Double.valueOf(panjang * lebar);
        System.out.println("Luas persegi= "+luas);
        
    }
    
}
