
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
public class palindrom {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter Some Integer TO Check Palindrom OR Not :");
        int r,num,sum=0,temp;
        num=input.nextInt();
        temp=num;
        while(temp!=0){
        
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            
        }
        System.out.println("The reverse Value is :"+sum);
        if(sum==num){
            System.out.println("This is palindrom");
        }
        else{
            System.out.println("So This is not palindrom");
        }
        
        
    }
    
}
