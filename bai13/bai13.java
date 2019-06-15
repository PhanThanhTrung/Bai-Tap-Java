/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                System.out.println("");
            else
                System.out.print(str.charAt(i));
        }
    }
}
