package com.tgt.igniteplus;
import java.util.*;
import java.math.*;
public class squareOfEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        for(int i=2;i<=2*n;i++)
        {
            if(i%2==0)      //check if even
            {
                int sq = (int) Math.pow(i, 2);
                System.out.print(sq + " ");
            }
        }
    }
}
