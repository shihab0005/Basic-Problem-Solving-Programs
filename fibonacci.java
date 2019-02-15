
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SK
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter How many Number Do you Insert :");
        int n=input.nextInt();
        
        int first=0,second=1,fibo;
        
        System.out.print(first+" "+second);
        for (int i = 3; i <=n; i++) {
            fibo =first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            
        }
    }
    
}
