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
public class Three {
    public static void main(String[] args) {
        SID:
        {
        int k=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(k+" ");
            if(k%2!=0)
                break SID;
            else 
                k++;
            }
        }
        
        System.out.println("OK BYE");
    }
}
