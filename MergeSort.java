/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AbdelAziz-Sayed 20120235 CS3
 */
public class MergeSort {
    public static void mergeSort(int[] arr)
    {
        System.out.println("");
        if(arr.length == 1)
            return;
        
        int mid = arr.length / 2 ;
        int[] left = new int [mid] ;
        int[] right = new int [arr.length - mid] ;
        for(int i = 0; i < left.length ; i++)
        {
            left[i] = arr[i] ;
            System.out.println("left of i " + left[i] );
        }
        for(int i = 0; i < right.length ; i++)
        {
            right[i] = arr[i+mid] ;
            System.out.println("right of i " + right[i] );
        }        
        System.out.println("done");
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    public static void merge(int[] res, int[] left, int[] right)
    {
        int i = 0, j = 0, k = 0 ;
        
        while (i < left.length && j < right.length)
        {
            System.out.println("mL " + left[i]);
            System.out.println("mR " + right[j]);
            if(left[i] <= right[j])
            {
                res[k] = left[i];
                i++;
            }
            else
            {
                res[k] = right[j];
                j++;               
            }
            k++;
            
        }
        while(i < left.length)
        {
            res[k] = left[i];
            k++;
            i++;
        }
        while(i < left.length)
        {
            res[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length)
        {
            res[k] = right[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        
        int size ;
        Scanner s = new Scanner (System.in) ;
        size = s.nextInt();
        int[] arr = new int [size];
        
        System.out.println("Before Sorting");
        Random r = new Random();
        for(int i = 0 ; i < arr.length ; i++ )
        {
            arr[i] = r.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        mergeSort(arr);
        System.out.println("\nAfter Sorting");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
	}
    }
    
}