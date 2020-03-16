package com.tgt.igniteplus;
import java.util.*;
public class numSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=(int)(Math.pow(i,2));
            System.out.print(c+",");
        }
    }
}
