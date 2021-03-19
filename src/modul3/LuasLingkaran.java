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
public class LuasLingkaran {
    public static void main(String[] args){
        int r;
        double phi, luas;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("<< Program Hitung Luas Lingkaran >>");
        System.out.println("Input r: ");
        r = input.nextInt();
        System.out.println("Inpur phi: ");
        phi = input.nextDouble();
        
        luas = Double.valueOf((phi * r * r) / 2);
        System.out.println("Luas Lingkaran= "+luas);
        
           
    }
    
}
