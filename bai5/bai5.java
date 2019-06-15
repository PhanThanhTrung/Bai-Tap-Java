/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a==0 && b== 0)
            System.out.println("phuong trinh co vo so nghiem");
        else if(a==0 && b!=0)
            System.out.println("phuong trinh vo nghiem");
        else
            System.out.println("phuong trinh co nghiem: "+(-b/a));
    }
}
