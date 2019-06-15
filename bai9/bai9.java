/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        int y= s.nextInt();
        switch(t)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
                break;
            case 2:
            {
                if(y%4==0 && y%100!=0)
                {
                    System.out.println("thang co 29 ngay");
                }
                else
                    System.out.println("thang co 28 ngay");
                break;
            }
            default:
                System.out.println("nhap sai");
        }
    }
}
