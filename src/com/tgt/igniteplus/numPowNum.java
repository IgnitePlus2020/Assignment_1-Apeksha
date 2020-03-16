package com.tgt.igniteplus;
import java.util.*;
public class numPowNum
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=(int)(Math.pow(i,i));
            System.out.print(c+",");
        }
    }
}
