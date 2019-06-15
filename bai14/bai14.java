/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai14 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isAlphabetic(str.charAt(i))==true)
                System.out.print(str.charAt(i));
        }
    }
}
