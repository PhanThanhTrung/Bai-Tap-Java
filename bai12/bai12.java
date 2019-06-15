/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author Phan Thanh Trung
 */
public class bai12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int value= s.nextInt();
        int sum=0;
        for(int i=1; i<value; i++)
        {
            if(value%i==0)
                sum+=i;
        }
        if(value==sum)
        {
            System.out.println("so hoan hao");
        }
        else
            System.out.println("khong phai so hoan hao");
    }
    
}
