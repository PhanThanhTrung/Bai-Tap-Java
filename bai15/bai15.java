/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai15 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();
        String b= s.nextLine();
        if (a.compareToIgnoreCase(b)==0)
        {
            System.out.println("hai chuoi da nhap bang nhau");
        }
        else
            System.out.println("hai chuoi khong bang nhau");
    }
}
