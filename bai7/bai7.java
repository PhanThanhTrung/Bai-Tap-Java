/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if(a+b>c&& a+c>b && b+c >a)
            System.out.println("chu vi cua tam giac la: "+ (a+b+c) + "\t dien tich cua tam giac la: " + Math.sqrt(((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c)*(a+b+c)/2));
        else
            System.out.println("3 canh khong the tao thanh tam giac");
    }
}
