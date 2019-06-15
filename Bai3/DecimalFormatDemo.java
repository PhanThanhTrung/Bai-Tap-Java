/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;

/**
 *
 * @author Phan Thanh Trung
 */
public class DecimalFormatDemo {
    public static void customFormat(String sample,double value)
    {
        DecimalFormat df = new DecimalFormat(sample);
        String output=df.format(value);
        System.out.println(value+ " theo mau: "+sample+" la "+output);
    }
    public static void main(String[] args) {
         customFormat("###,###.###", 123456.789);   
         customFormat("###.##", 123456.789);   
         customFormat("000000.000", 123.78);   
         customFormat("$###,###.###", 12345.67);      
         customFormat("###,##0.0#", 000.007); 
    }
}
