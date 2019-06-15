/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r= sc.nextFloat();
        System.out.println("ban kinh cua hinh cau la: "+r+" the tich la: "+ Math.PI*r*r*r*4/3 + " dien tich be mat la: "+ 4*Math.PI*r*r);
    }
}
