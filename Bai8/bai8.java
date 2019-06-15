/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai8 {
    public static float distance(float x1,float y1, float x2, float y2)
    {
        return (float) Math.sqrt(Math.pow((x1 - x2),2)+Math.pow((y2 - y1),2));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1= sc.nextFloat();
        float y1= sc.nextFloat();
        float x2= sc.nextFloat();
        float y2= sc.nextFloat();
        System.out.println("khoang cach giua 2 diem: ("+x1+","+y1+") va ("+x2+","+y2+") la: " + distance(x1,y1,x2,y2));
    }
}
