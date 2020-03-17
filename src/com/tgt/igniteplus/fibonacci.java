package com.tgt.igniteplus;
import java.util.*;
public class fibonacci
{
    public static void main(String[] args)
    {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int a[]=new int[n];
        a[0]=1;
        a[1]=1;
        for(i=2;i<n;i++)
            a[i]=a[i-1]+a[i-2];
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
