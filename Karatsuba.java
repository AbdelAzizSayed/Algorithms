/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karatsuba;

import java.util.Scanner;

/**
 *
 * @author Abdel-Aziz Sayed 
 */
public class Karatsuba {
    
    public static int karatsuba(int x, int y)
    {
        if(x < 10 )
        {
            return x*y ;
        }
        String s = Integer.toString(x);
        int n = s.length();
        
        String s2 = Integer.toString(y);
        if(s.length()%2 == 1)
        {
            s = "0" + s ;
            s2 = "0" + s2 ;
            n++ ;
        }
        int nD2 = s.length()/2;
  
        int a = Integer.parseInt(s.substring(0, nD2)) , b = Integer.parseInt(s.substring(nD2, s.length())) ;        
        int c = Integer.parseInt(s2.substring(0, nD2)) , d = Integer.parseInt(s2.substring(nD2, s2.length())) ;
        int z1 = karatsuba(a, c) ;
        int z3 = karatsuba(b, d) ;
        int z2 = karatsuba(a+b , c+d) - z1 - z3 ;
        
            return  (int) (Math.pow(10.0, n)*z1 + Math.pow(10.0, nD2)*z2 + z3 );
    }


    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int res = karatsuba(s.nextInt(), s.nextInt() );
        System.out.println("result = " + res);
    }
    
}
