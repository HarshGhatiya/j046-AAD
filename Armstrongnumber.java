package com.harshghatiya;
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {

        int number, sum = 0, num, r, count=0, num2;

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = sc.nextInt();
        num = number;
        num2 = number;

        //taking the count
        while (num>0) {
            num=num/10;
            count++;
        }

        //checking Armstrong condition
        while (num2 > 0) {
            r = num2 % 10;
            sum = (int) (sum + Math.pow(r,count));
            num2 = num2 / 10;
        }

        if(number == sum)
            System.out.println("Its an Armstrong Number.");
        else
            System.out.println("Its not an Armstrong Number.");
    }
}
