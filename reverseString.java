
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
public class reverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Enter A String :");
        name = input.nextLine();
        int num = name.length();
        String rev = " ";
        for (int i = num - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);

        }
        System.out.print("Reverse Of the String is :" + rev);
    }

}
