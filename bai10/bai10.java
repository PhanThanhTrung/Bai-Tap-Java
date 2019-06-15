/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float a = s.nextFloat();
        float b= s.nextFloat();
        String cach=s.nextLine(); // biến để hứng dấu enter
        String ch= s.nextLine();
        ch = ch.trim();
        switch(ch)
        {
            case "C":
                System.out.println("tong cua 2 so la: "+ (a+b));
                break;
            case "T":
            case "t":
                System.out.println("hieu cua 2 so la: "+ (a-b));
                break;
            case "N":
                System.out.println("tich cua 2 so la: "+ (a*b));
                break;
            case "d":
            case "D":
                System.out.println("thuong cua 2 so la: "+ (a/b));
                break;
        }
    }
}
