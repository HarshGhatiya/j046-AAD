package com.harshghatiya;
import java.util.Scanner;
import java.lang.Math;
public class Assignment2_number_ISBNnumber {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        long x,dc=0,noe,z=1,k=0,y=1,rem,nos=0,e=1,p;

        System.out.println("Enter a Number");
        x= in.nextLong();
        noe=x;

        p=x;
        while(p>0)
        {
            p=p/10;
            dc++;
        }

        while (y<=dc)
        {
            rem=noe%10;
            nos=rem*y;
            z=1;

            while (z<=1) {
                k=nos+k;
                z++;
            }
            noe=noe/10;
            y++;
        }

        e=k%11;
        if (e==0) {
            System.out.println("ISBN");
        }

        else{
            System.out.println("Not");
        }
    }
}