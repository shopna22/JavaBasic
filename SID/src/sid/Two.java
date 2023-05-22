/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sid;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Two {
    public static void main(String[] args) {
        int [][]arr;
        
        arr=new int[4][];
        
        arr[0]=new int[1];
        arr[1]=new int[2];
        arr[2]=new int[3];
        arr[3]=new int[4];
        
        Scanner s=new Scanner(System.in);
        System.out.println("My input :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("My output :");  
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+1+" ");
            }
            System.out.println("");
        }
    }
}
