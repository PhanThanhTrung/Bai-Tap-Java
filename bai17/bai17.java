/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                System.out.println("");
            else
                System.out.print(s.charAt(i));
        }
    }
}
