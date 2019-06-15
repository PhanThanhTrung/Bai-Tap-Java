/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float delta = b*c-4*a*c;
        if(delta<0)
            System.out.println("phuong trinh vo nghiem");
        else if(delta==0)
            System.out.println("phuong trinh co nghiem kep la: "+ (-b/(2*a)));
        else
            System.out.println("Phuong trinh co 2 nghiem phan biet: "+ ((-b+Math.sqrt(delta))/(2*a))+ " va "+((-b-Math.sqrt(delta))/(2*a)));
    }
}
