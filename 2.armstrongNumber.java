
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
public class armstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number To Check Amstrong Or not :");
        int r, num, sum = 0, temp;
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }
        if (num == sum) {
            System.out.println("This is Armstrong Number");
        } else {
            System.out.println("This is not Armstrong Number");
        }
    }

}
