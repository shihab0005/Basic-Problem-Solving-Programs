
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
public class FactorialDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1, num;
        System.out.print("Enter Positive Integer :");
        num = input.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("The Factorial Of " + num + " is =" + fact);
    }

}
