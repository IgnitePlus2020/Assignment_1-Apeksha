package com.tgt.igniteplus;
import java.util.*;
public class deciToBin
{
    public static void main(String[] args)
    {   int i=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        int a[]=new int[500];
        while(n>0)
        {
             a[i]=n%2;
             n=n/2;
             i++;
        }
        for(int j=i;j>=0;j--)
            System.out.print(a[j]+" ");
    }
}
