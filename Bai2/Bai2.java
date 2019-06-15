/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Phan Thanh Trung
 */
public class Bai2 {
    
    
    public static void main(String[] args) {
        Random rand= new Random();
        float cd= rand.nextFloat();
        float cr= rand.nextFloat();
        DecimalFormat d= new DecimalFormat("###,###.0#");
        System.out.println("dai="+cd+" rong="+cr+" chu vi="+d.format((cr+cd)*2)+" dien tich="+d.format(cr*cr));
    }
}
