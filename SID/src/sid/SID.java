/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sid;

/**
 *
 * @author Dell
 */
public class SID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=arr[0],min=arr[0];
            for (int element:arr) {
                if(max<element)
                    max=element;
            }
        System.out.println("The maximum value = "+max);
            for (int element:arr) {
                if(min>element)
                    min=element;
            }
         System.out.println("The minimum value = "+min);
    }
}