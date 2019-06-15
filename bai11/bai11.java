/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int value= s.nextInt();
        int new_value=0,sum=0;
        int n=value;
        while(value!=0)
        {
            new_value= new_value*10+value%10;
            sum+=value%10;
            value/=10;
        }
        System.out.println("tong cac chu so trong so: "+n+" la: "+sum);
        System.out.println("so viet nguoc la: "+ new_value);
    }
}
